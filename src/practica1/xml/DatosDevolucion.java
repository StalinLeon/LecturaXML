/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1.xml;

/**
 *
 * @author USUARIO
 */
public class DatosDevolucion {
    public String ruc;
    public String fechaEmision;
    public String claseAcceso;
    public String codigo;
    public String codigoPorcentaje;
    public String descuentoAdicional;
    public String baseImponible;
    public String tarifa;
    public String valor;

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getClaseAcceso() {
        return claseAcceso;
    }

    public void setClaseAcceso(String claseAcceso) {
        this.claseAcceso = claseAcceso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigoPorcentaje() {
        return codigoPorcentaje;
    }

    public void setCodigoPorcentaje(String codigoPorcentaje) {
        this.codigoPorcentaje = codigoPorcentaje;
    }

    public String getDescuentoAdicional() {
        return descuentoAdicional;
    }

    public void setDescuentoAdicional(String descuentoAdicional) {
        this.descuentoAdicional = descuentoAdicional;
    }

    public String getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(String baseImponible) {
        this.baseImponible = baseImponible;
    }

    public String getTarifa() {
        return tarifa;
    }

    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
