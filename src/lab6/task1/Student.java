package lab6.task1;
///Builder pattern
public class Student {
    private String nume;
    private double laborator;
    private double partial;
    private double examen;

    private Student() {
    }

    public String getNume() {
        return nume;
    }

    public double getLaborator() {
        return laborator;
    }

    public double getPartial() {
        return partial;
    }

    public double getExamen() {
        return examen;
    }
    public double sumaNote(){
        return laborator + partial + examen;
    }

    public static class Builder {
        private String nume;
        private double laborator;
        private double partial;
        private double examen;

        public Builder setNume(String nume) {
            this.nume = nume;
            return this;
        }

        public Builder setLaborator(double laborator) {
            this.laborator = laborator;
            return this;
        }

        public Builder setPartial(double partial) {
            this.partial = partial;
            return this;
        }

        public Builder setExamen(double examen) {
            this.examen = examen;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.nume = this.nume;
            student.laborator = this.laborator;
            student.partial = this.partial;
            student.examen = this.examen;
            return student;
        }
    }
}
