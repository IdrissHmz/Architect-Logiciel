package sample;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.typeadapters.RuntimeTypeAdapterFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.lang.reflect.Type;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Store store = new Store();
        for(int i=0; i<5; i++){
            store.transacProc.AddClient("idriss" ,100);
        }
        for(int i=0; i<10; i++){
            store.transacProc.AddFilm("star wars", 100,"fatima");
            store.transacProc.AddGame("star wars", 100,"idriss");
        }


        List<StockItem> films = store.queryProc.FindbyActor("fatima");

        for(StockItem f : films){
            System.out.printf(f.getName()+ "\n");
        }

        for(Client f : store.getClients()){
            System.out.printf(f.getNom() + "\n");
        }



        //launch(args);

    }
}
