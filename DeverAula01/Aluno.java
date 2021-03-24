public class Aluno extends Pessoa{
    private String matricula;
    private String curso;

    public Aluno(String matricula,String curso){
        this.matricula= matricula;
        this.curso= curso;
    }
    public Aluno(){
    }
    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public String getCurso() {
        return curso;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatricula(){
        System.out.println("Matrícula Cancelada!");
    }
}
