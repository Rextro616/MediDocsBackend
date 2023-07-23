package com.example.demo2.services;

import com.example.demo2.models.Archivo;
import com.example.demo2.models.cabeza.Cabeza;
import com.example.demo2.models.electrocardiograma.Electrocardiograma;
import com.example.demo2.models.examenFisico.ExamenFisico;
import com.example.demo2.models.exploracion.Exploracion;
import com.example.demo2.models.historiaClinica.HistoriaClinica;
import com.example.demo2.models.historiaClinica.HistoriaClinicaDTO;
import com.example.demo2.models.laboratorio.Laboratorio;
import com.example.demo2.models.neurologico.Neurologico;
import com.example.demo2.models.oftalmologico.Oftalmologico;
import com.example.demo2.models.paciente.Paciente;
import com.example.demo2.models.paciente.PacienteDTO;
import com.example.demo2.models.sinromatico.Sindromatico;
import com.example.demo2.models.tejido.Tejido;
import com.example.demo2.models.torax.Torax;
import com.example.demo2.repository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.*;
import java.util.List;

@Service
public class HistoriaClinicaService {
    @Autowired
    HistoriaClinicaRepository historiaClinicaRepository;

    @Autowired
    ModelMapper modelMapper;

    @Autowired
    PacienteRepository pacienteRepository;

    @Autowired
    ExamenFisicoRepository examenFisicoRepository;

    @Autowired
    TejidoRepository tejidoRepository;

    @Autowired
    CabezaRepository cabezaRepository;

    @Autowired
    OftalmologicoRepository oftalmologicoRepository;

    @Autowired
    TipoExploracionRepository tipoExploracionRepository;

    @Autowired
    NeurologicoRepository neurologicoRepository;

    @Autowired
    LaboratorioRepository laboratorioRepository;

    @Autowired
    ElectrocardiogramaRepository electrocardiogramaRepository;

    @Autowired
    ToraxRepository toraxRepository;

    @Autowired
    SindromaticoRepository sindromaticoRepository;

    @Autowired
    ArchivoService archivoService;

    @Transactional
    public Boolean postHistoriaClinica(HistoriaClinicaDTO historiaClinicaDTO) {
        HistoriaClinica historiaClinica = modelMapper.map(historiaClinicaDTO, HistoriaClinica.class);
        //exploracion 1
        List<Exploracion> exploracion = historiaClinica.getExploracion();
        if (exploracion != null){
            exploracion.forEach(exploracion1 -> exploracion1.setTipoExploracion(tipoExploracionRepository.getById(exploracion1.getTipoExploracion().getId())));;
        }
        //paciente
        historiaClinica.setPaciente(pacienteRepository.getById(historiaClinica.getPaciente().getId()));
        historiaClinicaRepository.save(historiaClinica);
        historiaClinica.getPaciente().getHistoriaClinica().add(historiaClinica);
        //examen fisico
        ExamenFisico fisico = historiaClinica.getExamenFisico();
        if (fisico != null) {
            fisico.setHistoriaClinica(historiaClinica);
            examenFisicoRepository.save(fisico);
        }
        //tejido
        Tejido tejido = historiaClinica.getTejido();
        if (tejido != null) {
            tejido.setHistoriaClinica(historiaClinica);
            tejidoRepository.save(tejido);
        }
        //cabeza
        Cabeza cabeza = historiaClinica.getCabeza();
        if (cabeza != null) {
            cabeza.setHistoriaClinica(historiaClinica);
            cabezaRepository.save(cabeza);
        }
        //oftalmologico
        Oftalmologico oftalmologico = historiaClinica.getOftalmologico();
        if (oftalmologico != null) {
            oftalmologico.setHistoriaClinica(historiaClinica);
            oftalmologicoRepository.save(oftalmologico);
        }
        //exploracion
        if (exploracion != null){
            exploracion.forEach(exploracion1 -> exploracion1.setHistoriaClinica(historiaClinica));
        }
        //neurologico
        Neurologico neurologico = historiaClinica.getNeurologico();
        if (neurologico != null){
            neurologico.setHistoriaClinica(historiaClinica);
            neurologicoRepository.save(neurologico);
        }
        //laboratorio
        Laboratorio laboratorio = historiaClinica.getLaboratorio();
        if (laboratorio != null){
            laboratorio.setHistoriaClinica(historiaClinica);
            laboratorioRepository.save(laboratorio);
        }
        //electrocardiograma
        Electrocardiograma electrocardiograma = historiaClinica.getElectrocardiograma();
        if (electrocardiograma != null){
            electrocardiograma.setHistoriaClinica(historiaClinica);
            electrocardiogramaRepository.save(electrocardiograma);
        }
        //torax
        Torax torax = historiaClinica.getTorax();
        if (torax != null){
            torax.setHistoriaClinica(historiaClinica);
            toraxRepository.save(torax);
        }
        //sindromatico
        Sindromatico sindromatico = historiaClinica.getSindromatico();
        if (sindromatico != null) {
            sindromatico.setHistoriaClinica(historiaClinica);
            sindromaticoRepository.save(sindromatico);
        }
        //archivo
        List<Archivo> archivo = historiaClinica.getArchivo();
        if (!archivo.isEmpty()){
            archivo.forEach(archivo1 -> archivo1.setHistoriaClinica(historiaClinica));
        }
        return true;
    }

    public List<HistoriaClinicaDTO> getById(Integer id){
        List<HistoriaClinicaDTO> listaPorId = new ArrayList<>();
        Paciente paciente = pacienteRepository.getById(id);

        paciente.getHistoriaClinica().forEach(historiaClinica -> listaPorId.add(modelMapper.map(historiaClinica, HistoriaClinicaDTO.class)));

        return listaPorId;
    }

    public List<HistoriaClinica> get() {
        return historiaClinicaRepository.findAll();
    }
}
