package familytree;

    
import javafx.scene.input.MouseEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.ListIterator;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

import javafx.scene.layout.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import static javafx.scene.control.ContentDisplay.BOTTOM;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class Main extends Application {

    Scene scene,scene2;
    Stage stage;
    private final Background focusBackground = new Background( new BackgroundFill( Color.web("#dedad7"), CornerRadii.EMPTY, Insets.EMPTY ) );
    private final Background unfocusBackground = new Background( new BackgroundFill( Color.web("#dedad7"), CornerRadii.EMPTY, Insets.EMPTY ) );
    private final Background Background2 = new Background( new BackgroundFill( Color.web("#9cb4db"), CornerRadii.EMPTY, Insets.EMPTY ) );
    public int Name;
   // public ArrayList <Hbox> h=new ArrayList<Hbox>();
     //ArrayList<children> childrens = new ArrayList<children>();
    public ArrayList<UserClass> objects=new ArrayList<UserClass>(); 
    public UserClass Start=new UserClass();
    public UserClass User=new UserClass();
    public UserClass User2=new UserClass();
    public FileChooser fileChooser = new FileChooser();
  public String Name2="";
     public address addr=new address();
     
      ListView<String> listViews = new ListView<String>();
      ListView<String> listViews2 = new ListView<String>();
        
     

    public static void main(String[] args) {
        launch(args); 
    }
    
    public UserClass getObject(String Name){

ListIterator<UserClass>  iterator = objects.listIterator(); 
    UserClass cl = new UserClass();
    try
    {             // Printing the iterated value 
            System.out.println("\nUsing ListIterator:\n"); 
            while (iterator.hasNext()) { 
               
                cl=iterator.next();
                if(cl.getFName()==Name){
                break;    
                }
            } 
        } 
  
        catch (NullPointerException e) { 
            System.out.println("Exception thrown : " + e); 
        }    
    return cl;

}
    

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        //User2.setFName("zain");
        User2.setMName("malik");
        User2.setSName("mmm");
        User2.SetFather("abc");
        User2.SetMother("abddc");
        User2.SetSpouse("dddd");
        User2.setGender("Male");
        User2.setDesc("I am a cute Little boy");
        stage = primaryStage;
        stage.setTitle("FamilyTree");
        
        addr.StreetName="Abc Street";
        addr.StreetNo=6;
        addr.suburb="Isb";
        addr.postCode=6540;
        
        User2.SetAdd(addr);
       

        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(1);
        
        

        //Name Label - constrains use (child, column, row)
        Label nameLabel = new Label("Welcome to the family tree");
            nameLabel.setFont(Font.font ("Verdana", 20));
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name Input
          ChoiceBox<String> choiceBox2 = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox2.getItems().add("Father");
        choiceBox2.getItems().add("Mother");
        choiceBox2.getItems().add("Spouse");
        choiceBox2.getItems().add("Children");
        
         Label labr= new Label("Relation");
        labr.setFont(Font.font ("Verdana", 20));
          HBox Hxbc=new HBox(10);
          Hxbc.getChildren().addAll(labr,choiceBox2);
        
          ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObservableList object which you can add items to
        choiceBox.getItems().add("Male");
        choiceBox.getItems().add("Female");
        
        
        Button button1 = new Button("Load Tree");
        Button button3 = new Button("Save Tree");
         Button button4 = new Button("Create New Tree");
         Button button5 = new Button("Select File");
         Button button6 = new Button("Edit Details");
         Button button7= new Button("Add Relative");
         Button button8 = new Button("Add");
         Button button9 = new Button("Update");
         Button button10 = new Button("Add to family tree");
         Label lab3 = new Label("Select a Family Member to View Information");
        lab3.setFont(Font.font ("Verdana", 20));
        
         //HBox Hxb=new HBox(10);
        //Hxb.setPadding(new Insets(10,0,0,10)); 
        Label lab4= new Label("Person Info");
        lab4.setFont(Font.font ("Verdana", 20));
        
        Label lab5= new Label("Name:");
        lab5.setFont(Font.font ("Verdana", 15));
    
        Label lab6= new Label("SurrName:");
        lab6.setFont(Font.font ("Verdana", 15));
    
        Label lab7= new Label("Maiden Name:");
        lab7.setFont(Font.font ("Verdana", 15));
    
        Label lab8= new Label("Gender:");
        lab8.setFont(Font.font ("Verdana", 15));
    
        Label lab9= new Label("Life Description:");
        lab9.setFont(Font.font ("Verdana", 15));
    
        Label lab10= new Label("Address Information");
        lab10.setFont(Font.font ("Verdana", 20));
    
        Label lab11= new Label("Street Number:");
        lab11.setFont(Font.font ("Verdana", 15));
    
        Label lab12= new Label("Street Name:");
        lab12.setFont(Font.font ("Verdana", 15));
    
        Label lab13= new Label("Suburb:");
        lab13.setFont(Font.font ("Verdana", 15));
        
        Label lab0= new Label("PostCode:");
        lab0.setFont(Font.font ("Verdana", 15));
    
        Label lab14= new Label("Relative Info");
        lab14.setFont(Font.font ("Verdana", 20));
    
        Label lab15= new Label("Father:");
        lab15.setFont(Font.font ("Verdana", 15));
    
        Label lab16= new Label("Mother:");
        lab16.setFont(Font.font ("Verdana", 15));
    
        Label lab17= new Label("Spouse:");
        lab17.setFont(Font.font ("Verdana", 15));
    
        Label lab18= new Label("Children:");
        lab18.setFont(Font.font ("Verdana", 15));
    
        Label lab19= new Label("GrChidlren:");
        lab19.setFont(Font.font ("Verdana", 15));
        
        
        ///////////////////////////////

        Label lab4b= new Label("Person Info");
        lab4b.setFont(Font.font ("Verdana", 20));
        
        Label lab5b= new Label("Name:");
        lab5b.setFont(Font.font ("Verdana", 15));
    
        Label lab6b= new Label("SurrName:");
        lab6b.setFont(Font.font ("Verdana", 15));
    
        Label lab7b= new Label("Maiden Name:");
        lab7b.setFont(Font.font ("Verdana", 15));
    
        Label lab8b= new Label("Gender:");
        lab8b.setFont(Font.font ("Verdana", 15));
    
        Label lab9b= new Label("Life Description:");
        lab9b.setFont(Font.font ("Verdana", 15));
    
        Label lab10b= new Label("Address Information");
        lab10b.setFont(Font.font ("Verdana", 20));
    
        Label lab11b= new Label("Street Number:");
        lab11b.setFont(Font.font ("Verdana", 15));
    
        Label lab12b= new Label("Street Name:");
        lab12b.setFont(Font.font ("Verdana", 15));
    
        Label lab13b= new Label("Suburb:");
        lab13b.setFont(Font.font ("Verdana", 15));
        
        Label lab0b= new Label("PostCode:");
        lab0b.setFont(Font.font ("Verdana", 15));
    
        Label lab14b= new Label("Relative Info");
        lab14b.setFont(Font.font ("Verdana", 20));
    
        Label lab15b= new Label("Father:");
        lab15b.setFont(Font.font ("Verdana", 15));
    
        Label lab16b= new Label("Mother:");
        lab16b.setFont(Font.font ("Verdana", 15));
    
        Label lab17b= new Label("Spouse:");
        lab17b.setFont(Font.font ("Verdana", 15));
    
        Label lab18b= new Label("Children:");
        lab18b.setFont(Font.font ("Verdana", 15));
    
        Label lab19b= new Label("Grand Chilren:");
        lab19b.setFont(Font.font ("Verdana", 15));
        
        
        
        
        
        
        Label lab20= new Label(" Please Choose a File :");
        lab20.setFont(Font.font ("Verdana", 20));
        
         
       Label lab25=new Label();
       lab25.setFont(Font.font ("Verdana", 15));
       lab25.setText(User2.getFName());
       
       Label lab26=new Label();
       lab26.setFont(Font.font ("Verdana", 15));
       lab26.setText(User2.getSName());
       
       Label lab27=new Label();
       lab27.setFont(Font.font ("Verdana", 15));
       lab27.setText(User2.getMName());
      
       Label lab28=new Label();
       lab28.setFont(Font.font ("Verdana", 15));
       lab28.setText(User2.getGender());
       
       Label lab29=new Label();
       lab29.setFont(Font.font ("Verdana", 15));
       lab29.setText(User2.getDesc());
       
       Label lab30=new Label();
       lab30.setFont(Font.font ("Verdana", 15));
       lab30.setText("" +User2.getStNo());
       
       Label lab31=new Label();
       lab31.setFont(Font.font ("Verdana", 15));
       lab31.setText(User2.getStName());
       
       Label lab32=new Label();
       lab32.setFont(Font.font ("Verdana", 15));
       lab32.setText(User2.getSub());
       
       Label lab33=new Label();
       lab33.setFont(Font.font ("Verdana", 15));
       lab33.setText(""+User2.getPost());
       
       Label lab34=new Label();
       lab34.setFont(Font.font ("Verdana", 15));
       lab34.setText(User2.getFather());
       
       Label lab35=new Label();
       lab35.setFont(Font.font ("Verdana", 15));
       lab35.setText(User2.getMother());
       
       Label lab36=new Label();
       lab36.setFont(Font.font ("Verdana", 15));
       lab36.setText(User2.getSpouse());
       
       TextField t1=new TextField();
       t1.setFont(Font.font ("Verdana", 15));
       
       TextField t2=new TextField();
       t2.setFont(Font.font ("Verdana", 15));
       
       TextField t3=new TextField();
       t3.setFont(Font.font ("Verdana", 15));
       
       TextField t4=new TextField();
       t4.setFont(Font.font ("Verdana", 15));
       
       TextField t5=new TextField();
       t5.setFont(Font.font ("Verdana", 15));
       
       TextField t6=new TextField();
       t6.setFont(Font.font ("Verdana", 15));
       
       TextField t7=new TextField();
       t7.setFont(Font.font ("Verdana", 15));
       
       TextField t8=new TextField();
       t8.setFont(Font.font ("Verdana", 15));
       
       TextField t9=new TextField();
       t9.setFont(Font.font ("Verdana", 15));
       
       TextField t10=new TextField();
       t10.setFont(Font.font ("Verdana", 15));
       
       TextField t11=new TextField();
       t11.setFont(Font.font ("Verdana", 15));
       
       TextField t12=new TextField();
       t12.setFont(Font.font ("Verdana", 15));
       
       TextField t13=new TextField();
       t13.setFont(Font.font ("Verdana", 15));
       
       TextField t14=new TextField();
       t14.setFont(Font.font ("Verdana", 15));
       
       
       
       Label lab21= new Label("Starting Person :");
        lab21.setId("Person");
        lab21.setFont(Font.font ("Verdana", 15));
        
    
        Label lab22= new Label(" Parents :");
        lab22.setFont(Font.font ("Verdana", 15));
    
        Label lab23= new Label(" Spouse :");
        lab23.setFont(Font.font ("Verdana", 15));
    
        Label lab24= new Label(" Children :");
        lab24.setFont(Font.font ("Verdana", 15));
       
       
       
       
       Label tlab1=new Label("FatherName");
  
       tlab1.setFont(Font.font ("Verdana", 10));
       Label tlab2=new Label("MotherName");
       tlab2.setFont(Font.font ("Verdana", 10));
       
       Label tlab3=new Label("SpouseName");
       tlab3.setFont(Font.font ("Verdana", 10));
       Label tlab4=new Label("Children1");
       
       tlab4.setId("1");
       tlab4.setFont(Font.font ("Verdana", 10));
       
       Label tlab5=new Label("Children1 Spouse");
       tlab5.setFont(Font.font ("Verdana", 10));
       tlab5.setId("Child1");
       
       Label tlab6=new Label("Children1 Children");
       tlab6.setFont(Font.font ("Verdana", 10));
       tlab6.setId("Child1");
       
       Label tlab7=new Label("Children2");
       tlab7.setFont(Font.font ("Verdana", 10));
       tlab7.setId("Child1");
       
       Label tlab8=new Label("Children3");
       tlab8.setFont(Font.font ("Verdana", 10));
       tlab8.setId("Child1");
       
       Label tlab9=new Label("Children3 Spouse");
       tlab9.setFont(Font.font ("Verdana", 10));
       tlab9.setId("Child1");
       
       Label tlab10=new Label("Children3 Children");
       tlab10.setFont(Font.font ("Verdana", 10));
       tlab10.setId("Child1");
       
       Label lab21b= new Label("Starting Person :");
        lab21b.setId("Person");
        lab21b.setFont(Font.font ("Verdana", 15));
        
    
        Label lab22b= new Label(" Parents :");
        lab22b.setFont(Font.font ("Verdana", 15));
    
        Label lab23b= new Label(" Spouse :");
        lab23b.setFont(Font.font ("Verdana", 15));
    
        Label lab24b= new Label(" Children :");
        lab24b.setFont(Font.font ("Verdana", 15));
       
       
       
       
       Label tlab1b=new Label("FatherName");
       tlab1b.setFont(Font.font ("Verdana", 10));
       Label tlab2b=new Label("MotherName");
       tlab2b.setFont(Font.font ("Verdana", 10));
       
       Label tlab3b=new Label("SpouseName");
       tlab3b.setFont(Font.font ("Verdana", 10));
       Label tlab4b=new Label("Children1");
       tlab4b.setFont(Font.font ("Verdana", 10));
       tlab4b.setId("Child1");
       
       Label tlab5b=new Label("Children1 Spouse");
       tlab5b.setFont(Font.font ("Verdana", 10));
       tlab5b.setId("Child1");
       
       Label tlab6b=new Label("Children1 Children");
       tlab6b.setFont(Font.font ("Verdana", 10));
       tlab6b.setId("Child1");
       
       Label tlab7b=new Label("Children2");
       tlab7b.setFont(Font.font ("Verdana", 10));
       tlab7b.setId("Child1");
       
       Label tlab8b=new Label("Children3");
       tlab8b.setFont(Font.font ("Verdana", 10));
       tlab8b.setId("Child1");
       
       Label tlab9b=new Label("Children3 Spouse");
       tlab9b.setFont(Font.font ("Verdana", 10));
       tlab9b.setId("Child1");
       
       Label tlab10b=new Label("Children3 Children");
       tlab10b.setFont(Font.font ("Verdana", 10));
       tlab10.setId("Child1");
       
       
       ////////////////////////////////////
       
       HBox Hxb=new HBox(10);
        Hxb.setPadding(new Insets(10,0,0,10));
         Hxb.getChildren().addAll(lab22b);
        
          HBox HxFb=new HBox(10);
        HxFb.setPadding(new Insets(10,0,0,30));
         HxFb.getChildren().addAll(tlab1b);
         
         
          HBox HxMb=new HBox(10);
        HxMb.setPadding(new Insets(10,0,0,30));
         HxMb.getChildren().addAll(tlab2b);
         
         
         HBox Hx2b=new HBox(10);
        Hx2b.setPadding(new Insets(10,0,0,10));
         Hx2b.getChildren().addAll(lab23b);
        
         HBox HxSb=new HBox(10);
        HxSb.setPadding(new Insets(10,0,0,30));
         HxSb.getChildren().addAll(tlab3b);
         
         
         HBox Hx3b=new HBox(10);
        Hx3b.setPadding(new Insets(10,0,0,10));
         Hx3b.getChildren().addAll(lab24b);
         
         HBox Hxc1b=new HBox(10);
        Hxc1b.setPadding(new Insets(10,0,0,30));
         Hxc1b.getChildren().addAll(tlab4b);
         
         HBox Hxc1sb=new HBox(10);
         Hxc1sb.setPadding(new Insets(10,0,0,30));
         Hxc1sb.getChildren().addAll(tlab5b);
        
         HBox Hxc1cb=new HBox(10);
         Hxc1cb.setPadding(new Insets(10,0,0,45));
         Hxc1cb.getChildren().addAll(tlab6b);
         
         HBox Hxc2b=new HBox(10);
         Hxc2b.setPadding(new Insets(10,0,0,30));
         Hxc2b.getChildren().addAll(tlab7b);
         
         HBox Hxc3b=new HBox(10);
         Hxc3b.setPadding(new Insets(10,0,0,30));
         Hxc3b.getChildren().addAll(tlab8b);
         
         HBox Hxc3sb=new HBox(10);
         Hxc3sb.setPadding(new Insets(10,0,0,30));
         Hxc3sb.getChildren().addAll(tlab9b);
         
         HBox Hxc3cb=new HBox(10);
         Hxc3cb.setPadding(new Insets(10,0,0,45));
         Hxc3cb.getChildren().addAll(tlab10b);
       
       
       
       
       /////////////////////////
       
       String cssLayout = "-fx-border-color: silver;\n" +
                   "-fx-border-insets: 0;\n" +
                   "-fx-border-width: 2;\n" +
                   "-fx-border-style: Solid;\n";
        VBox Vx=new VBox(50);
        Vx.prefWidthProperty().bind(stage.widthProperty().multiply(0.4));
        Vx.prefHeightProperty().bind(stage.heightProperty().multiply(0.80));
        Vx.setStyle(cssLayout);
         HBox Hx=new HBox(10);
        Hx.setPadding(new Insets(10,0,0,10));
         Hx.getChildren().addAll(lab22);
        
          HBox HxF=new HBox(10);
        HxF.setPadding(new Insets(10,0,0,30));
         HxF.getChildren().addAll(tlab1);
         
         
          HBox HxM=new HBox(10);
        HxM.setPadding(new Insets(10,0,0,30));
         HxM.getChildren().addAll(tlab2);
         
         
         HBox Hx2=new HBox(10);
        Hx2.setPadding(new Insets(10,0,0,10));
         Hx2.getChildren().addAll(lab23);
        
         HBox HxS=new HBox(10);
        HxS.setPadding(new Insets(10,0,0,30));
         HxS.getChildren().addAll(tlab3);
         
         
         HBox Hx3=new HBox(10);
        Hx3.setPadding(new Insets(10,0,0,10));
         Hx3.getChildren().addAll(lab24);
         
         HBox Hxc1=new HBox(10);
        Hxc1.setPadding(new Insets(10,0,0,30));
         Hxc1.getChildren().addAll(tlab4);
         
         HBox Hxc1s=new HBox(10);
         Hxc1s.setPadding(new Insets(10,0,0,30));
         Hxc1s.getChildren().addAll(tlab5);
        
         HBox Hxc1c=new HBox(10);
         Hxc1c.setPadding(new Insets(10,0,0,45));
         Hxc1c.getChildren().addAll(tlab6);
         
         HBox Hxc2=new HBox(10);
         Hxc2.setPadding(new Insets(10,0,0,30));
         Hxc2.getChildren().addAll(tlab7);
         
         HBox Hxc3=new HBox(10);
         Hxc3.setPadding(new Insets(10,0,0,30));
         Hxc3.getChildren().addAll(tlab8);
         
         HBox Hxc3s=new HBox(10);
         Hxc3s.setPadding(new Insets(10,0,0,30));
         Hxc3s.getChildren().addAll(tlab9);
         
         HBox Hxc3c=new HBox(10);
         Hxc3c.setPadding(new Insets(10,0,0,45));
         Hxc3c.getChildren().addAll(tlab10);
        
        Vx.getChildren().addAll(lab21,Hx,HxF,HxM,Hx2,HxS,Hx3,Hxc1,Hxc1s,Hxc1c,Hxc2,Hxc3,Hxc3s,Hxc3c);
        
        Vx.setBackground( unfocusBackground );
        Vx.setPadding(new Insets(10,10,10,10));
        Vx.setSpacing(10);
        
        GridPane.setConstraints(Vx,0,3);      
        
         Button broot = new Button("Add Root Person");
          Label lab2 = new Label("Load a tree or add a new root person");
         lab2.setFont(Font.font ("Verdana", 20));
        VBox Vx2=new VBox(10);
        Vx2.prefWidthProperty().bind(stage.widthProperty().multiply(0.6));
        Vx2.getChildren().addAll(broot,lab2);
            //Vx2.setStyle(cssLayout);
        Vx2.setBackground( focusBackground );
        Vx2.setPadding(new Insets(10,10,10,10));
        Vx2.setSpacing(10);
        
        GridPane.setConstraints(Vx2,1,3);
       
        /*
        
        VBox Vx3=new VBox(10);
        Vx3.prefWidthProperty().bind(stage.widthProperty().multiply(0.6));
        Vx3.getChildren().add(lab3);
            //Vx2.setStyle(cssLayout);
        Vx3.setBackground( focusBackground );
        Vx3.setPadding(new Insets(10,10,10,10));
        Vx3.setSpacing(10);
        GridPane.setConstraints(Vx3,1,3);
*/
        
    
        VBox Vx4=new VBox(10);
        
        Vx4.prefWidthProperty().bind(stage.widthProperty().multiply(0.6));
        
        HBox Hb1=new HBox(20);
        Hb1.getChildren().addAll(lab5,lab25);
       
         HBox Hb3=new HBox(20);
        Hb3.getChildren().addAll(lab6,lab26);
        
         HBox Hb4=new HBox(20);
        Hb4.getChildren().addAll(lab7,lab27);
         
        HBox Hb5=new HBox(20);
        Hb5.getChildren().addAll(lab8,lab28);
         
        HBox Hb6=new HBox(20);
        Hb6.getChildren().addAll(lab9,lab29);
        
        HBox Hb7=new HBox(20);
        Hb7.getChildren().addAll(lab11,lab30);
         
        HBox Hb8=new HBox(20);
        Hb8.getChildren().addAll(lab12,lab31);
         
        HBox Hb9=new HBox(20);
        Hb9.getChildren().addAll(lab13,lab32); 
        
        HBox Hb10=new HBox(20);
        Hb10.getChildren().addAll(lab0,lab33);
         
        HBox Hb11=new HBox(20);
        Hb11.getChildren().addAll(lab15,lab34);
         
        HBox Hb12=new HBox(20);
        Hb12.getChildren().addAll(lab16,lab35);
        
        HBox Hb13=new HBox(20);
        Hb13.getChildren().addAll(lab17,lab36);
        
        
        
        HBox Hb2=new HBox(20);
        Hb2.getChildren().addAll(button6,button7);
        Hb2.setAlignment(Pos.BOTTOM_CENTER);
       
        HBox layouttt = new HBox(10);
        //layout.setPadding(new Insets(20, 20, 20, 20));
        layouttt.getChildren().addAll(lab18,listViews);
        
        HBox layouttt2 = new HBox(10);
        //layout.setPadding(new Insets(20, 20, 20, 20));
        layouttt2.getChildren().addAll(lab19,listViews2);
        
        //Hb1,Hb3,Hb4,Hb5,Hb6,Hb7,Hb8,Hb9,Hb9,Hb10,Hb11,Hb12,Hb13,
          Vx4.getChildren().addAll(lab3,lab4,Hb1,Hb3,Hb4,Hb5,Hb6,lab10,Hb7,Hb8,Hb9,Hb10,lab14,Hb11,Hb12,Hb13,layouttt,layouttt2,Hb2);
         //Vx4.setStyle(cssLayout);
        Vx4.setBackground(Background2);
        Vx4.setPadding(new Insets(10,10,10,10));
        Vx4.setSpacing(10);
        GridPane.setConstraints(Vx4,1,3);
        
        
        /////////////////////////////////////
        //Addd new mode
       VBox Vx4b=new VBox(10);
        
        Vx4b.prefWidthProperty().bind(stage.widthProperty().multiply(0.6));
        
        HBox Hb1b=new HBox(20);
        Hb1b.getChildren().addAll(lab5b,t1);
       
         HBox Hb3b=new HBox(20);
        Hb3b.getChildren().addAll(lab6b,t2);
        
         HBox Hb4b=new HBox(20);
        Hb4b.getChildren().addAll(lab7b,t3);
         
        HBox Hb5b=new HBox(20);
        Hb5b.getChildren().addAll(lab8b,choiceBox);
         
        HBox Hb6b=new HBox(20);
        Hb6b.getChildren().addAll(lab9b,t5);
        
        HBox Hb7b=new HBox(20);
        Hb7b.getChildren().addAll(lab11b,t6);
         
        HBox Hb8b=new HBox(20);
        Hb8b.getChildren().addAll(lab12b,t7);
         
        HBox Hb9b=new HBox(20);
        Hb9b.getChildren().addAll(lab13b,t8); 
        
        HBox Hb10b=new HBox(20);
        Hb10b.getChildren().addAll(lab0b,t9);
         
       
        HBox Hb11b=new HBox(20);
        Hb11b.getChildren().addAll(lab15b,t10);
         
        HBox Hb12b=new HBox(20);
        Hb12b.getChildren().addAll(lab16b,t11);
        
        HBox Hb13b=new HBox(20);
        Hb13b.getChildren().addAll(lab17b,t12);
        
        Button B1=new Button("Add");
        TextField tc=new TextField();
         tc.setFont(Font.font ("Verdana", 15));
        HBox Hb14b=new HBox(10);
        Hb14b.getChildren().addAll(lab18b,tc,B1);
        Button B2=new Button("Add");
        
        TextField tgc=new TextField();
         tgc.setFont(Font.font ("Verdana", 15));
        HBox Hb15b=new HBox(10);
        Hb15b.getChildren().addAll(lab19b,tgc,B2);
        
        HBox Hb16=new HBox(10);
        Hb15b.getChildren().add(lab14b);
        //lab14,Hb11b,Hb12,Hb13,Hb14,Hb15
        /*
        HBox Hb2b=new HBox(20);
        Hb2b.getChildren().addAll(button6,button7);
        Hb2.setAlignment(Pos.BOTTOM_CENTER);;
               */
        //Hb1,Hb3,Hb4,Hb5,Hb6,Hb7,Hb8,Hb9,Hb9,Hb10,Hb11,Hb12,Hb13,
         
        Vx4b.getChildren().addAll(lab4b,Hb1b,Hb3b,Hb4b,Hb5b,Hb6b,lab10b,Hb7b,Hb8b,Hb9b,Hb10b);
         //Vx4b.setStyle(cssLayout);
        Vx4b.setBackground(Background2);
        Vx4b.setPadding(new Insets(10,10,10,10));
        Vx4b.setSpacing(10);
        GridPane.setConstraints(Vx4b,1,3);
        
        
        ////////////////
        //edit mode
        
        
        
        
        
        
        
        ///////////
        //GridPane.setConstraints(Vx7,1,4);
        
        VBox Vx3=new VBox(10);
        Vx3.prefWidthProperty().bind(stage.widthProperty().multiply(0.6));
        Vx3.getChildren().addAll(lab3);
            //Vx2.setStyle(cssLayout);
        Vx3.setBackground( focusBackground );
        Vx3.setPadding(new Insets(10,10,10,10));
        Vx3.setSpacing(10);
        GridPane.setConstraints(Vx3,1,3);
        
       
        VBox Vx5=new VBox(10);
        Vx5.prefWidthProperty().bind(stage.widthProperty().multiply(0.6));
        Vx5.getChildren().addAll(lab3);
            //Vx2.setStyle(cssLayout);
        Vx5.setBackground( focusBackground );
        Vx5.setPadding(new Insets(10,10,10,10));
        Vx5.setSpacing(10);
        GridPane.setConstraints(Vx5,1,3);
        
        VBox Vx6=new VBox(10);
        Vx6.prefWidthProperty().bind(stage.widthProperty().multiply(0.6));
        Vx6.getChildren().addAll(lab20,button5);
            //Vx2.setStyle(cssLayout);
        Vx6.setBackground( focusBackground );
        Vx6.setPadding(new Insets(10,10,10,10));
        Vx6.setSpacing(10);
        GridPane.setConstraints(Vx6,1,3);
       
        
        
        
        
                 
         
         
         HBox layout2=new HBox(10);
          layout2.getChildren().addAll(button1,button3,button4);
        GridPane.setConstraints(layout2,0,1);
        
        
        
        //Label lab2 = new Label("Person Info");
        
        
        
        
        
        
        
        


        //Add everything to grid
        
        
         fileChooser.getExtensionFilters().add(
     new FileChooser.ExtensionFilter("Data Files", "*.dat")
    
);
        
         
         tlab1.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
               
               System.out.println(Start.father);
            System.out.println("Hello");
               User=getObject(Start.father);
         /////////////////////////
              // User2.setFName(t1.getText());
          lab25.setText(User.getFName());
          
          //User2.setSName(t2.getText());
         lab26.setText(User.getSName());
          
         
         //User2.setMName(t3.getText());
          
          lab27.setText(User.getMName());
          
          //User2.setGender(choiceBox.getValue());
          lab28.setText(User.getGender());
          
          //User2.setDesc(t5.getText());
          lab29.setText(User.getDesc());
          
          
          
          //User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+User.getStNo());
                  
          
          //User2.setStName(t7.getText());
          lab31.setText(User.getStName());
          
          //User2.setSub(t8.getText());
          lab32.setText(User.getSub());
          
          //User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+User.getPost());
          
        //  User2.SetFather(t10.getText());
          lab34.setText(User.getFather());
          
         // User2.SetMother(t11.getText());
          lab35.setText(User.getMother());
         
         // User2.SetSpouse(t12.getText());
          lab36.setText(User.getSpouse());
          
             
               
               
               /////////////////////////
         grid.getChildren().addAll(Vx4);
      }
    });
         
         
        tlab2.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
            User=getObject(Start.mother);
         /////////////////////////
              // User2.setFName(t1.getText());
          lab25.setText(User.getFName());
          
          //User2.setSName(t2.getText());
         lab26.setText(User.getSName());
          
         
         //User2.setMName(t3.getText());
          
          lab27.setText(User.getMName());
          
          //User2.setGender(choiceBox.getValue());
          lab28.setText(User.getGender());
          
          //User2.setDesc(t5.getText());
          lab29.setText(User.getDesc());
          
          
          
          //User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+User.getStNo());
                  
          
          //User2.setStName(t7.getText());
          lab31.setText(User.getStName());
          
          //User2.setSub(t8.getText());
          lab32.setText(User.getSub());
          
          //User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+User.getPost());
          
        //  User2.SetFather(t10.getText());
          lab34.setText(User.getFather());
          
         // User2.SetMother(t11.getText());
          lab35.setText(User.getMother());
         
         // User2.SetSpouse(t12.getText());
          lab36.setText(User.getSpouse());
          
             
               
               
               /////////////////////////
         grid.getChildren().addAll(Vx4);
      }
    });
        
    tlab3.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
            User=getObject(Start.spouse);
         /////////////////////////
              // User2.setFName(t1.getText());
          lab25.setText(User.getFName());
          
          //User2.setSName(t2.getText());
         lab26.setText(User.getSName());
          
         
         //User2.setMName(t3.getText());
          
          lab27.setText(User.getMName());
          
          //User2.setGender(choiceBox.getValue());
          lab28.setText(User.getGender());
          
          //User2.setDesc(t5.getText());
          lab29.setText(User.getDesc());
          
          
          
          //User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+User.getStNo());
                  
          
          //User2.setStName(t7.getText());
          lab31.setText(User.getStName());
          
          //User2.setSub(t8.getText());
          lab32.setText(User.getSub());
          
          //User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+User.getPost());
          
        //  User2.SetFather(t10.getText());
          lab34.setText(User.getFather());
          
         // User2.SetMother(t11.getText());
          lab35.setText(User.getMother());
         
         // User2.SetSpouse(t12.getText());
          lab36.setText(User.getSpouse());
          
             
               
               
               /////////////////////////
         grid.getChildren().addAll(Vx4);
      }
    });    
        
    ////////////////////     
    tlab4.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
          
            
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
           
            Name2=Start.getChild(1);
            System.out.println(Name2); 
            User=getObject(Name2);
         /////////////////////////
              // User2.setFName(t1.getText());
          lab25.setText(User.getFName());
          
          //User2.setSName(t2.getText());
         lab26.setText(User.getSName());
          
         
         //User2.setMName(t3.getText());
          
          lab27.setText(User.getMName());
          
          //User2.setGender(choiceBox.getValue());
          lab28.setText(User.getGender());
          
          //User2.setDesc(t5.getText());
          lab29.setText(User.getDesc());
          
          
          
          //User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+User.getStNo());
                  
          
          //User2.setStName(t7.getText());
          lab31.setText(User.getStName());
          
          //User2.setSub(t8.getText());
          lab32.setText(User.getSub());
          
          //User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+User.getPost());
          
        //  User2.SetFather(t10.getText());
          lab34.setText(User.getFather());
          
         // User2.SetMother(t11.getText());
          lab35.setText(User.getMother());
         
         // User2.SetSpouse(t12.getText());
          lab36.setText(User.getSpouse());
          
             
               
               
               /////////////////////////
         grid.getChildren().addAll(Vx4);
      }
    });     
    
    
         
         
         
         ///////////////////
        lab21.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
         /////////////////////////
              // User2.setFName(t1.getText());
          lab25.setText(Start.getFName());
          
          //User2.setSName(t2.getText());
         lab26.setText(Start.getSName());
          
         
         //User2.setMName(t3.getText());
          
          lab27.setText(Start.getMName());
          
          //User2.setGender(choiceBox.getValue());
          lab28.setText(Start.getGender());
          
          //User2.setDesc(t5.getText());
          lab29.setText(Start.getDesc());
          
          
          
          //User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+Start.getStNo());
                  
          
          //User2.setStName(t7.getText());
          lab31.setText(Start.getStName());
          
          //User2.setSub(t8.getText());
          lab32.setText(Start.getSub());
          
          //User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+Start.getPost());
          
        //  User2.SetFather(t10.getText());
          lab34.setText(Start.getFather());
          
         // User2.SetMother(t11.getText());
          lab35.setText(Start.getMother());
         
         // User2.SetSpouse(t12.getText());
          lab36.setText(Start.getSpouse());
          
          Start.getChilds(listViews);
           String message = "";
        ObservableList<String> childs;
        childs = listViews.getSelectionModel().getSelectedItems();

        for(String m: childs)
            message += m + "\n";

        System.out.println(message);
         
        
        Start.getGChilds(listViews2);
           String message2 = "";
        ObservableList<String> gchilds;
        gchilds = listViews.getSelectionModel().getSelectedItems();

        for(String m: gchilds)
            message2 += m + "\n";

        System.out.println(message2);
          
               
               
               
               /////////////////////////
         grid.getChildren().addAll(Vx4);
      }
    });
       
        ///////////////////////////////
        
        lab22.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
         grid.getChildren().add(Vx4);
      }
    });
        
        lab23.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
         grid.getChildren().add(Vx4);
      }
    });
        
       lab24.setOnMouseClicked(new EventHandler<MouseEvent>() {
      @Override
      public void handle(MouseEvent e) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
         grid.getChildren().add(Vx4);
      }
    }); 
        
        
        
        choiceBox.setOnAction( e -> {
            
            if(choiceBox.getValue()=="Male"){
           if(Vx4b.getChildren().contains(Hb4b)){     
                
                    
                  
                }
           else if(choiceBox.getValue()=="Female"){
               
               System.out.println(choiceBox.getValue());
        }
            }
        });
                
                
                
       
        button7.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
               
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
          if( grid.getChildren().contains(Vx4))
       {
           
            grid.getChildren().remove(Vx4);
           
          
        }
          if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
          if(Vx4b.getChildren().contains(lab14b)){
              Vx4b.getChildren().remove(lab14b);
          }
          if(Vx4b.getChildren().contains(Hb11b)){
              Vx4b.getChildren().remove(Hb11b);
          }
          if(Vx4b.getChildren().contains(Hb12b)){
              Vx4b.getChildren().remove(Hb12b);
          }
          if(Vx4b.getChildren().contains(Hb13b)){
              Vx4b.getChildren().remove(Hb13b);
          }
          if(Vx4b.getChildren().contains(Hb14b)){
              Vx4b.getChildren().remove(Hb14b);
          }
          if(Vx4b.getChildren().contains(Hb15b)){
              Vx4b.getChildren().remove(Hb15b);
          } 
           if(Vx4b.getChildren().contains(button9)){
              Vx4b.getChildren().remove(button9);
          }
           if(Vx4b.getChildren().contains(button8)){
              Vx4b.getChildren().remove(button8);
          }
           
        //Hxbc.setPadding(new Insets(10,0,0,10));
          
          Vx4b.getChildren().addAll(Hxbc,button10);
               grid.getChildren().add(Vx4b);
            
            }
        }); 
       
        
        broot.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
               
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
          if( grid.getChildren().contains(Vx4))
       {
           
            grid.getChildren().remove(Vx4);
           
          
        }
          if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
         //lab14b,Hb11b,Hb12b,Hb13b,Hb14b,Hb15b
          if(Vx4b.getChildren().contains(Hxbc)){
              Vx4b.getChildren().remove(Hxbc);
          }
          
          if(Vx4b.getChildren().contains(lab14b)){
              Vx4b.getChildren().remove(lab14b);
          }
          if(Vx4b.getChildren().contains(Hb11b)){
              Vx4b.getChildren().remove(Hb11b);
          }
          if(Vx4b.getChildren().contains(Hb12b)){
              Vx4b.getChildren().remove(Hb12b);
          }
          if(Vx4b.getChildren().contains(Hb13b)){
              Vx4b.getChildren().remove(Hb13b);
          }
          if(Vx4b.getChildren().contains(Hb14b)){
              Vx4b.getChildren().remove(Hb14b);
          }
          if(Vx4b.getChildren().contains(Hb15b)){
              Vx4b.getChildren().remove(Hb15b);
          }
          if(Vx4b.getChildren().contains(button9)){
              Vx4b.getChildren().remove(button9);
          }
          if(Vx4b.getChildren().contains(button10)){
              Vx4b.getChildren().remove(button10);
          }
          Vx4b.getChildren().add(button8);
               grid.getChildren().addAll(Vx4b);
            
            }
        });
        
        
        
       
        button6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
               
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
          if( grid.getChildren().contains(Vx4))
       {
           
            grid.getChildren().remove(Vx4);
           
          
        }
          if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
           if(Vx4b.getChildren().contains(Hxbc)){
              Vx4b.getChildren().remove(Hxbc);
          }
          
          Vx4b.getChildren().addAll(lab14b,Hb11b,Hb12b,Hb13b);
           if(Vx4b.getChildren().contains(button8)){
              Vx4b.getChildren().remove(button8);
          }
            if(Vx4b.getChildren().contains(button10)){
              Vx4b.getChildren().remove(button10);
          }
           Vx4b.getChildren().add(button9);
               grid.getChildren().addAll(Vx4b);
            
            }
        });
        ////////////////////
         button10.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            User2.setFName(t1.getText());
          lab25.setText(User2.getFName());
          
          User2.setSName(t2.getText());
         lab26.setText(User2.getSName());
          
         
         User2.setMName(t3.getText());
          
          lab27.setText(User2.getMName());
          
          User2.setGender(choiceBox.getValue());
          lab28.setText(User2.getGender());
          
          User2.setDesc(t5.getText());
          lab29.setText(User2.getDesc());
          
          
          
          User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+User2.getStNo());
                  
          
          User2.setStName(t7.getText());
          lab31.setText(User2.getStName());
          
          User2.setSub(t8.getText());
          lab32.setText(User2.getSub());
          
          User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+User2.getPost());
          
          objects.add(User2);
          if(choiceBox2.getValue()=="Father")
          {
             Start.SetFather(User2.getFName());
           //  Start.addC(STYLESHEET_MODENA);
         
//   
             lab34.setText(Start.getFather());
             //System.out.println(Start.);
          }
          else if(choiceBox2.getValue()=="Mother")
          {
             Start.SetMother(User2.getFName());
             lab34.setText(Start.getFather());
          }
          else if(choiceBox2.getValue()=="Spouse")
          {
             Start.SetSpouse(User2.getFName());
          }
          else if(choiceBox2.getValue()=="Children")
          {
             Start.addC(User2.getFName());
          }
         
          
          
          /*
          Start.setFName(User2.getFName());
          Start.setMName(User2.getMName());
          Start.setSName(User2.getSName());
          Start.setGender(User2.getGender());
          Start.setDesc(User2.getDesc());
          Start.setStNo(User2.getStNo());
          Start.setStName(User2.getStName());
          Start.setSub(User2.getSub());
          Start.setPost(User2.getPost());
          */
          /*
          
                    
          User2.SetFather(t10.getText());
          lab34.setText(User2.getFather());
          
          User2.SetMother(t11.getText());
          lab35.setText(User2.getMother());
         
          User2.SetSpouse(t12.getText());
          lab36.setText(User2.getSpouse());
            */
            }
          
         });
        
        
        
        /////////////////////////
         button8.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
            User2.setFName(t1.getText());
          lab25.setText(User2.getFName());
          
          User2.setSName(t2.getText());
         lab26.setText(User2.getSName());
          
         
         User2.setMName(t3.getText());
          
          lab27.setText(User2.getMName());
          
          User2.setGender(choiceBox.getValue());
          lab28.setText(User2.getGender());
          
          User2.setDesc(t5.getText());
          lab29.setText(User2.getDesc());
          
          
          
          User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+User2.getStNo());
                  
          
          User2.setStName(t7.getText());
          lab31.setText(User2.getStName());
          
          User2.setSub(t8.getText());
          lab32.setText(User2.getSub());
          objects.add(User2);
          
          User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+User2.getPost());
          
          Start.setFName(User2.getFName());
          Start.setMName(User2.getMName());
          Start.setSName(User2.getSName());
          Start.setGender(User2.getGender());
          Start.setDesc(User2.getDesc());
          Start.setStNo(User2.getStNo());
          Start.setStName(User2.getStName());
          Start.setSub(User2.getSub());
          Start.setPost(User2.getPost());
          /*
          
                    
          User2.SetFather(t10.getText());
          lab34.setText(User2.getFather());
          
          User2.SetMother(t11.getText());
          lab35.setText(User2.getMother());
         
          User2.SetSpouse(t12.getText());
          lab36.setText(User2.getSpouse());
            */
            }
          
         });
        
        
        
        
        button3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
         if( grid.getChildren().contains(Vx2))
        {
            grid.getChildren().remove(Vx2);
          
        } 
        if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
          if( grid.getChildren().contains(Vx4b))
       {
           
            grid.getChildren().remove(Vx4b);
           
          
        }
          if( grid.getChildren().contains(Vx6))
       {
           
            grid.getChildren().remove(Vx6);
           
          
        }
         
        // System.out.println(t1.getText());
         User2.setFName(t1.getText());
          lab25.setText(User2.getFName());
          
          User2.setSName(t2.getText());
         lab26.setText(User2.getSName());
          
         
         User2.setMName(t3.getText());
          
          lab27.setText(User2.getMName());
          
          User2.setGender(choiceBox.getValue());
          lab28.setText(User2.getGender());
          
          User2.setDesc(t5.getText());
          lab29.setText(User2.getDesc());
          
          
          
          User2.setStNo(Integer.parseInt(t6.getText()));
          lab30.setText(""+User2.getStNo());
                  
          
          User2.setStName(t7.getText());
          lab31.setText(User2.getStName());
          
          User2.setSub(t8.getText());
          lab32.setText(User2.getSub());
          
          User2.setPost(Integer.parseInt(t9.getText()));
          //System.out.println(Integer.parseInt(t9.getText()));
          lab33.setText(""+User2.getPost());
                    
          User2.SetFather(t10.getText());
          lab34.setText(User2.getFather());
          
          User2.SetMother(t11.getText());
          lab35.setText(User2.getMother());
          
          User2.SetSpouse(t12.getText());
          lab36.setText(User2.getSpouse());
          
          
               grid.getChildren().add(Vx4);
            
            }
        });
        
        
        
       
        button1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
         if( grid.getChildren().contains(Vx2))
        {
           
            grid.getChildren().remove(Vx2);
           
          
        } 
                
                
                
          if( grid.getChildren().contains(Vx5))
        {
           
            grid.getChildren().remove(Vx5);
           
            
            
          
        }
               if( grid.getChildren().contains(Vx4))
       {
           
            grid.getChildren().remove(Vx4);
           
          
        }
           
               grid.getChildren().add(Vx6);
            
            }
        });
       
           button5.setOnAction(e -> {
            File selectedFile = fileChooser.showOpenDialog(primaryStage);
            System.out.println(selectedFile);
        });

        
        button4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
               if( grid.getChildren().contains(Vx3))
       {
           
            grid.getChildren().remove(Vx3);
           
          
        }
               if( grid.getChildren().contains(Vx4))
       {
           
            grid.getChildren().remove(Vx4);
           
          
        }
           
               
               grid.getChildren().add(Vx2);
                  }
        });

        grid.getChildren().addAll(nameLabel,layout2,Vx,Vx5);
       
        User2.setFName(t1.getText());
       
        scene = new Scene(grid, 900, 900);
        
        
        stage.setScene(scene);
        stage.show();
    }
    


}