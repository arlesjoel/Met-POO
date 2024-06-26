package Model;

public class Empleado {
private int ID;
private String Nombres;
private String Apellidos;
private String Cargo;
private double Salario;

    public Empleado() {
    }

    public Empleado(int ID, String Nombres, String Apellidos, String Cargo, double Salario) {
        this.ID = ID;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Cargo = Cargo;
        this.Salario = Salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

}
