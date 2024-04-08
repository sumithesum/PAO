package lab6.task1;

public class LisaStudenti {
    private Student[] studenti;

    public LisaStudenti(Student[] studenti) {
        this.studenti = studenti;
    }

    public LisaStudenti() {
    }

    public void addStudent(Student student) {
        if (studenti == null) {
            studenti = new Student[1];
            studenti[0] = student;
        } else {
            Student[] studentiNou = new Student[studenti.length + 1];
            for (int i = 0; i < studenti.length; i++) {
                studentiNou[i] = studenti[i];
            }
            studentiNou[studenti.length] = student;
            studenti = studentiNou;
        }
    }

    void sortareMaiMare() {
        for (int i = 0; i < studenti.length - 1; i++) {
            for (int j = i + 1; j < studenti.length; j++) {
                if (studenti[i].sumaNote() < studenti[j].sumaNote()) {
                    Student aux = studenti[i];
                    studenti[i] = studenti[j];
                    studenti[j] = aux;
                }
            }
        }

    }

    void sortarePartial() {
        for (int i = 0; i < studenti.length - 1; i++) {
            for (int j = i + 1; j < studenti.length; j++) {
                if (studenti[i].getPartial() < studenti[j].getPartial()) {
                    Student aux = studenti[i];
                    studenti[i] = studenti[j];
                    studenti[j] = aux;
                }
            }
        }

    }

    void sorareMedie() {
        sortareMaiMare();
    }

    void afisare() {
        for (int i = 1; i <= studenti.length; i++) {
            System.out.println(i + ". " + studenti[i - 1].getNume() + " " + studenti[i - 1].getLaborator() + " " + studenti[i - 1].getPartial() + " " + studenti[i - 1].getExamen());
        }
    }
}
