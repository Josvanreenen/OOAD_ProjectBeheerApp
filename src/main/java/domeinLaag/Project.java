package domeinLaag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Project {
    private String code;
    private String beschrijving;
    private Date startDatum;
    private List<Activiteit> activiteiten;

    private List<Projectlid> projectleden;

    public Project(String code, String beschrijving, Date startDatum) {
        this.code = code;
        this.beschrijving = beschrijving;
        this.startDatum = startDatum;
        this.activiteiten = new ArrayList<>();
        this.projectleden = new ArrayList<>();
    }

    private List<Activiteit> getActiviteiten() {
        return activiteiten;
    }

    @Override
    public String toString() {
        return "Project{" +
                "code='" + code + '\'' +
                ", beschrijving='" + beschrijving + '\'' +
                ", startDatum=" + startDatum +
                ", activiteiten=" + activiteiten +
                ", projectleden=" + projectleden +
                '}';
    }

    public void addProjectlid(Projectlid projectlid) {
        if(!projectleden.contains(projectlid)&&projectlid!=null) {
            projectleden.add(projectlid);
        }
    }

    public boolean addActiviteit(Activiteit activiteit) {
        if(!activiteiten.contains(activiteit)&&activiteit!=null) {
            return activiteiten.add(activiteit);
        }
        return false;
    }
}
