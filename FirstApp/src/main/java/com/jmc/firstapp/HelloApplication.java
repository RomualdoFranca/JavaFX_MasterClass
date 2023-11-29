package com.jmc.firstapp;


import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    // implement the start method
    // exclui o 'throws Exception' porque nao queremos abrir nenhuma IO ( Input/Output )
    @Override
    public void start(Stage stage)  {

        // metodo para fechar a aplicacao de forma implicita
        // esse metodo, por padrao, tem o valor true
        Platform.setImplicitExit(false);

        // Analogia do teatro
        // um arranjo vertical onde todos os controles são organizados verticalmente
        VBox root = new VBox(); // 'root' é o nome da VBox. É o layout da VBox

        // alinhado os elementos
        root.setAlignment(Pos.CENTER);

        // adicionando espaço com relacao ao limite do layout principal
        root.setPadding(new Insets(20,20,20,20)); // v; left, v1:top, v2:right, v3:bottom

        //adiciona espaco entre os elementos
        root.setSpacing(50);

        // criando os controles
        Label text = new Label("Label Name");
        Button button = new Button("Click Me");
        Button button1 = new Button("Exit explicitly");
        // adicionando funcionalidade
        button.setOnAction(e -> text.setText("Welcome to JavaFX Application")); // e ->: expressao lambda

        // usa-se threads para controlar eventos separadamente
        button1.setOnAction(event -> Platform.exit()); // chamando o metodo exit


        // adicionando os controles ao main layout ( layout principal )
        root.getChildren().addAll(text, button, button1);

        // cria a "cena" da peça de teatro depois de ter criado o cenario e os componetes da peça
        Scene scene = new Scene(root, 350, 300); // v: largura, v1: altura

        // adiciona a cena
        stage.setScene(scene);

        // adiciona um titulo para a janela
        stage.setTitle("JavaFX Application");

        // depois de tudo pronto a cena esta pronta para ser apresentada
        stage.show();

    }

    // chama o metodo stop no arquivo Application.java
    // fecha a aplicaçao de forma explicita
    @Override
    public void stop() {
        // mostra a qual thread pertence.Se pertence a laucher thread ou a application thread
        System.out.println(Thread.currentThread().getName());
        System.out.println("Closing the Application");
    }


    public static void main(String[] args) {
        launch();
    }
}
