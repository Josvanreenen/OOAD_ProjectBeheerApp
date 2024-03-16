package userInterfaceLaag;

import domeinLaag.Activiteit;
import domeinLaag.Project;
import domeinLaag.Projectlid;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Project project = createProject();
        printProject(project);
        launch(args);
    }

    public static void printProject(Project project) {
        System.out.println(project);
    }

    //initialize dummy data (use lorem ipsum)
    public static Project createProject() {
        Project project = new Project("P1", "Project 1", new java.util.Date());
        Projectlid projectlid = new Projectlid();
        projectlid.setNaam("John Doe");
        projectlid.setFunctie("Developer");
        project.addProjectlid(projectlid);
        Activiteit activiteit = new Activiteit();
        activiteit.setNaam("Activiteit 1");
        activiteit.setWeekNr(1);
        activiteit.setAantalUren(40);
        activiteit.setUitvoerder(projectlid);
        project.addActiviteit(activiteit);
        return project;
    }

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println("Starting application");
        //load fxml from resources userInterfaceLaag.Activiteit_toevoegen.fxml
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Activiteit_toevoegen.fxml"));
        Scene parent = new Scene(loader.load());
        stage.setTitle("Activiteit toevoegen");
        stage.setScene(parent);
        stage.show();



    }
}