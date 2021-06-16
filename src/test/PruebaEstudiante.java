String n,s;
    int nota;

   

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public void mostrar(){
        System.out.println("Nombre: "+this.n+"\nSexo:  "+this.s+"\nNota:  "+this.nota);
    }