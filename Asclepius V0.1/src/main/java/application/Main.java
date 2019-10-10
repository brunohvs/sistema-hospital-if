package application;

import util.Rotas;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class Main extends Application {

    static Stage stageAtual;
    static FXMLLoader loader;

    @Override
    public void start(Stage stage) throws Exception {
        stageAtual = stage;
        loader = new FXMLLoader(getClass().getResource(Rotas.LOGIN));
        Scene scene = new Scene((Parent) loader.load());
        scene.getStylesheets().add(getClass().getResource("../CSS/app.css").toExternalForm());
        stage.setScene(scene);
        stage.show();

    }

    public static void openPage(String rota) throws Exception {

        loader = new FXMLLoader(Main.class.getResource(rota));
        Scene scene = new Scene((Parent) loader.load());
        scene.getStylesheets().add(Main.class.getResource("../CSS/app.css").toExternalForm());
        stageAtual.setScene(scene);
        stageAtual.show();

    }

    public static void main(String[] args) throws SQLException {
        launch(args);



    }
}
