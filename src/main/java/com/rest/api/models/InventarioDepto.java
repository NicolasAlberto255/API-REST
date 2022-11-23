package com.rest.api.models;

import javax.persistence.*;

@Entity
@Table(name = "inventarioDepto")
public class InventarioDepto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idInventarioDepto")
    private int idInventarioDepto;

    @Column(name = "CNTSILLAS")
    private int cntSillas;  

    @Column(name = "CNTMESAS")
    private int cntMesas;

    @Column(name = "CNTSOFAS")
    private int cntSofas;

    @Column(name = "CNTCAMAS")
    private int cntCamas;

    @Column(name = "CNTCOJINES")
    private int cntCojines;

    @Column(name = "CNTLAMPARAS")
    private int cntLamparas;

    @Column(name = "CNTCORTINAS")
    private int cntCortinas;

    @Column(name = "CNTMUEBLES")
    private int cntMuebles;

    @Column(name = "CNTCLOSET")
    private int cntCloset;

    @Column(name = "CNTCUADROS")
    private int cntCuadros;

    @Column(name = "CNTADORNOS")
    private int cntAdornos;

    @Column(name = "CNTESPEJOHABITACION")
    private int cntEspejoHabitacion;

    @Column(name = "CNTPLANTAS")
    private int cntPlantas;

    @Column(name = "CNTTV")
    private int cntTV;

    @Column(name = "CNTLAVADORAS")
    private int cntLavadoras;

    @Column(name = "CNTMICROONDAS")
    private int cntMicroondas;

    @Column(name = "CNTREFRIGERADORES")
    private int cntRefrigeradores;

    @Column(name = "CNTESTUFAS")
    private int cntEstufas;

    @Column(name = "CNTCOCINAS")
    private int cntCocinas;

    @Column(name = "CNTSECADORAS")
    private int cntSecadoras;

    @Column(name = "CNTCAFETERAS")
    private int cntCafeteras;

    @Column(name = "CNTHORNOS")
    private int cntHornos;

    @Column(name = "CNTTENEDORES")
    private int cntTenedores;

    @Column(name = "CNTCUCHARAS")
    private int cntCucharas;

    @Column(name = "CNTCUCHILLOS")
    private int cntCuchillos;

    @Column(name = "CNTPLATOS")
    private int cntPlatos;

    @Column(name = "CNTTAZAS")
    private int cntTazas;

    @Column(name = "CNTVASOS")
    private int cntVasos;

    @Column(name = "CNTALFOMBRAS")
    private int cntAlfombras;

    @Column(name = "CNTESPEJOBANO")
    private int cntEspejoBano;

    @Column(name = "CNTTOALLAS")
    private int cntToallas;

    @Column(name = "CNTDUCHAS")
    private int cntDuchas;

    @Column(name = "CNTBANERAS")
    private int cntBaneras;

    @Column(name = "CNTJACUZZIS")
    private int cntJacuzzis;

    @ManyToOne
    @JoinColumn(name = "idDepartamentos")
    private Departamentos departamentos;

    public InventarioDepto() {
    }

    public int getIdInventarioDepto() {
        return idInventarioDepto;
    }

    public void setIdInventarioDepto(int idInventarioDepto) {
        this.idInventarioDepto = idInventarioDepto;
    }

    public int getCntSillas() {
        return cntSillas;
    }

    public void setCntSillas(int cntSillas) {
        this.cntSillas = cntSillas;
    }

    public int getCntMesas() {
        return cntMesas;
    }

    public void setCntMesas(int cntMesas) {
        this.cntMesas = cntMesas;
    }

    public int getCntSofas() {
        return cntSofas;
    }

    public void setCntSofas(int cntSofas) {
        this.cntSofas = cntSofas;
    }

    public int getCntCamas() {
        return cntCamas;
    }

    public void setCntCamas(int cntCamas) {
        this.cntCamas = cntCamas;
    }

    public int getCntCojines() {
        return cntCojines;
    }

    public void setCntCojines(int cntCojines) {
        this.cntCojines = cntCojines;
    }

    public int getCntLamparas() {
        return cntLamparas;
    }

    public void setCntLamparas(int cntLamparas) {
        this.cntLamparas = cntLamparas;
    }

    public int getCntCortinas() {
        return cntCortinas;
    }

    public void setCntCortinas(int cntCortinas) {
        this.cntCortinas = cntCortinas;
    }

    public int getCntMuebles() {
        return cntMuebles;
    }

    public void setCntMuebles(int cntMuebles) {
        this.cntMuebles = cntMuebles;
    }

    public int getCntCloset() {
        return cntCloset;
    }

    public void setCntCloset(int cntCloset) {
        this.cntCloset = cntCloset;
    }

    public int getCntCuadros() {
        return cntCuadros;
    }

    public void setCntCuadros(int cntCuadros) {
        this.cntCuadros = cntCuadros;
    }

    public int getCntAdornos() {
        return cntAdornos;
    }

    public void setCntAdornos(int cntAdornos) {
        this.cntAdornos = cntAdornos;
    }

    public int getCntEspejoHabitacion() {
        return cntEspejoHabitacion;
    }

    public void setCntEspejoHabitacion(int cntEspejoHabitacion) {
        this.cntEspejoHabitacion = cntEspejoHabitacion;
    }

    public int getCntPlantas() {
        return cntPlantas;
    }

    public void setCntPlantas(int cntPlantas) {
        this.cntPlantas = cntPlantas;
    }

    public int getCntTV() {
        return cntTV;
    }

    public void setCntTV(int cntTV) {
        this.cntTV = cntTV;
    }

    public int getCntLavadoras() {
        return cntLavadoras;
    }

    public void setCntLavadoras(int cntLavadoras) {
        this.cntLavadoras = cntLavadoras;
    }

    public int getCntMicroondas() {
        return cntMicroondas;
    }

    public void setCntMicroondas(int cntMicroondas) {
        this.cntMicroondas = cntMicroondas;
    }

    public int getCntRefrigeradores() {
        return cntRefrigeradores;
    }

    public void setCntRefrigeradores(int cntRefrigeradores) {
        this.cntRefrigeradores = cntRefrigeradores;
    }

    public int getCntEstufas() {
        return cntEstufas;
    }

    public void setCntEstufas(int cntEstufas) {
        this.cntEstufas = cntEstufas;
    }

    public int getCntCocinas() {
        return cntCocinas;
    }

    public void setCntCocinas(int cntCocinas) {
        this.cntCocinas = cntCocinas;
    }

    public int getCntSecadoras() {
        return cntSecadoras;
    }

    public void setCntSecadoras(int cntSecadoras) {
        this.cntSecadoras = cntSecadoras;
    }

    public int getCntCafeteras() {
        return cntCafeteras;
    }

    public void setCntCafeteras(int cntCafeteras) {
        this.cntCafeteras = cntCafeteras;
    }

    public int getCntHornos() {
        return cntHornos;
    }

    public void setCntHornos(int cntHornos) {
        this.cntHornos = cntHornos;
    }

    public int getCntTenedores() {
        return cntTenedores;
    }

    public void setCntTenedores(int cntTenedores) {
        this.cntTenedores = cntTenedores;
    }

    public int getCntCucharas() {
        return cntCucharas;
    }

    public void setCntCucharas(int cntCucharas) {
        this.cntCucharas = cntCucharas;
    }

    public int getCntCuchillos() {
        return cntCuchillos;
    }

    public void setCntCuchillos(int cntCuchillos) {
        this.cntCuchillos = cntCuchillos;
    }

    public int getCntPlatos() {
        return cntPlatos;
    }

    public void setCntPlatos(int cntPlatos) {
        this.cntPlatos = cntPlatos;
    }

    public int getCntTazas() {
        return cntTazas;
    }

    public void setCntTazas(int cntTazas) {
        this.cntTazas = cntTazas;
    }

    public int getCntVasos() {
        return cntVasos;
    }

    public void setCntVasos(int cntVasos) {
        this.cntVasos = cntVasos;
    }

    public int getCntAlfombras() {
        return cntAlfombras;
    }

    public void setCntAlfombras(int cntAlfombras) {
        this.cntAlfombras = cntAlfombras;
    }

    public int getCntEspejoBano() {
        return cntEspejoBano;
    }

    public void setCntEspejoBano(int cntEspejoBano) {
        this.cntEspejoBano = cntEspejoBano;
    }

    public int getCntToallas() {
        return cntToallas;
    }

    public void setCntToallas(int cntToallas) {
        this.cntToallas = cntToallas;
    }

    public int getCntBaneras() {
        return cntBaneras;
    }

    public void setCntBaneras(int cntBaneras) {
        this.cntBaneras = cntBaneras;
    }

    public int getCntDuchas() {
        return cntDuchas;
    }

    public void setCntDuchas(int cntDuchas) {
        this.cntDuchas = cntDuchas;
    }

    public int getCntJacuzzis() {
        return cntJacuzzis;
    }

    public void setCntJacuzzis(int cntJacuzzis) {
        this.cntJacuzzis = cntJacuzzis;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }
}
