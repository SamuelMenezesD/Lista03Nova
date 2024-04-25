package br.edu.up.modelos;

public class CienciaComputacao {
    private double ntlab;
    private double ntav;
    private double ntexfinal;

    public CienciaComputacao(double nlab, double ntav, double ntexfinal){
        this.ntlab = nlab;
        this.ntav = ntav;
        this.ntexfinal = ntexfinal;

    }
    public double notaCiencia(){
        return ((ntlab * 2)+(ntav * 3)+(ntexfinal * 5))/10;

        
    }
    public double getNtlab() {
        return ntlab;
    }
    public void setNtlab(double ntlab) {
        this.ntlab = ntlab;
    }
    public double getNtav() {
        return ntav;
    }
    public void setNtav(double ntav) {
        this.ntav = ntav;
    }
    public double getNtexfinal() {
        return ntexfinal;
    }
    public void setNtexfinal(double ntexfinal) {
        this.ntexfinal = ntexfinal;
    }
    
}
