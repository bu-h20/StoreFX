import java.util.Random; 
import javafx.application.Application; 
import static javafx.application.Application.launch; 
import javafx.geometry.Insets; 
import javafx.geometry.Pos; 
import javafx.scene.Scene; 
import javafx.scene.control.Button; 
import javafx.scene.control.Label; 
import javafx.scene.control.RadioButton; 
import javafx.scene.control.TextField; 
import javafx.scene.control.ToggleGroup; 
import javafx.scene.image.Image; 
import javafx.scene.image.ImageView; 
import javafx.scene.layout.Background; 
import javafx.scene.layout.BackgroundFill; 
import javafx.scene.layout.CornerRadii; 
import javafx.scene.layout.GridPane; 
import javafx.scene.layout.HBox; 
import javafx.scene.layout.Pane; 
import javafx.scene.layout.VBox; 
import javafx.scene.paint.Color; 
import javafx.scene.text.Font; 
import javafx.scene.text.FontPosture; 
import javafx.scene.text.FontWeight; 
import javafx.scene.text.Text; 
import javafx.stage.Stage; 
 
 
 
 
public class NewFXMain extends Application  { 
     
 
@Override 
public void start (Stage primaryStage){ 
 
         User custmor=new User("cu123","321"); 
  
         Label lable1 = new Label(); 
         lable1.setTextFill(Color.RED); 
         lable1.setLayoutX(450); 
         lable1.setLayoutY(300); 
  
 
     // Create the image views 
    ImageView[] imageViews0 = { 
             
        new ImageView(new Image("store/Arrow.png")), 
        new ImageView(new Image("store/Arrow.png")), 
        new ImageView(new Image("store/Arrow.png")) 
    }; 
    for (ImageView imageView0 : imageViews0) { 
        imageView0.setFitHeight(30); 
        imageView0.setFitWidth(30); 
    } 

 
// Load the first image and create an ImageView for it 
Image image = new Image("store/theam2.png"); 
ImageView imageView = new ImageView(image); 
imageView.setFitHeight(1000); 
imageView.setFitWidth(1000); 
 
// Load the second image and create an ImageView for it 
Image imagee = new Image("store/logo.PNG"); 
ImageView imageVieww = new ImageView(imagee); 
imageVieww.setFitHeight(230); 
imageVieww.setFitWidth(300); 
imageVieww.setX(10); 
imageVieww.setY(270); 
 
// Create a Text object with custom formatting 
Text text1 = new Text(90, 120, "Welcome to Lavender Lite Boutique"); 
text1.setFont(Font.font("Welcome to Lavender Lite Boutique", FontWeight.BOLD, 
FontPosture.ITALIC, 20)); 
text1.setStroke(Color.DARKSLATEGREY); 
 
// Create a Button with custom formatting 
Button start = new Button("Start"); 
start.setFont(Font.font("Start", FontWeight.BOLD, 17)); 
start.setLayoutX(220); 
start.setLayoutY(170); 
start.setBackground(new Background(new BackgroundFill(Color.BEIGE, new 
CornerRadii(20), null))); 
 
// Create a Pane and add all the elements to it 
Pane pane1 = new Pane(); 
pane1.getChildren().addAll(imageView, imageVieww, text1, start); 
 
// Create a Scene with the Pane and set it on the primary stage 
Scene scene = new Scene(pane1, 500, 500); 
primaryStage.setTitle("Login"); 
primaryStage.setScene(scene); 
primaryStage.show(); 
 
         
 
// add an image to the left half of the scene  
Image image1 = new Image("store/theam5.jpg"); 
ImageView imageView1 = new ImageView(image1); 
imageView1.setFitHeight(400); 
imageView1.setFitWidth(350); 
 
// add an image to the right half of the scene  
Image image2 = new Image("store/theam2.png"); 
ImageView imageView2 = new ImageView(image2); 
imageView2.setFitHeight(400); 
imageView2.setFitWidth(350); 
imageView2.setX(350); 
 
// // add a small image to the left side 
Image image3 = new Image("store/theam3.jpg"); 
ImageView imageView3 = new ImageView(image3);  

 
imageView3.setFitHeight(230); 
imageView3.setFitWidth(230); 
imageView3.setX(80); 
imageView3.setY(90);     
                  
// all text in First window 
Text text = new Text (130, 50, " Lavender Lite Boutique") ; 
text.setStroke(Color.DARKSLATEGREY); 
text.setFont(Font.font("Lavender Lite Boutique", FontWeight.BOLD, 
FontPosture.ITALIC, 35) ) ; 
//===== 
Text text3 = new Text (400, 150, "Username"); 
text3.setFont(Font.font ("Username", FontWeight.BOLD, 15) ) ; 
//===== 
Text text4 = new Text (400,200, "password") ; 
text4.setFont(Font.font ("password", FontWeight.BOLD, 15) ) ; 
//// all TextField in First window 
TextField textd1=new TextField(); 
textd1.setPrefColumnCount(10); 
textd1.setLayoutX(480); 
textd1.setLayoutY(135); 
//==== 
TextField textd2=new TextField(); 
textd2.setPrefColumnCount(10); 
textd2.setLayoutX(480); 
textd2.setLayoutY(185); 
 
// Button for login 
Button login = new Button ("Login") ; 
login.setFont(Font.font ("Login", FontWeight.BOLD, 17) ) ; 
login.setLayoutX(500); 
login.setLayoutY (250) ; 
 
BackgroundFill backgroundFill = new BackgroundFill(Color.BEIGE, new 
CornerRadii(20), null); 
Background background = new Background(backgroundFill); 
login.setBackground(background); 
//login.setBackground(new Background(new BackgroundFill(Color.BEIGE, new 
CornerRadii(20), null))); 
 
 
Pane pane = new Pane(); 
pane.getChildren().addAll( imageView1, imageView2, 
imageView3, login, text, text3, text4 , textd1 , textd2 , 
lable1); 
text.setFill(Color.WHITE) ; 
Scene scene1 = new Scene (pane, 700, 400); 
scene.setFill(Color.LAVENDER); 
 
  
       
        primaryStage.setTitle("Boutique"); 
        primaryStage.setScene(scene); 
        primaryStage.show(); 
         
         
         start.setOnAction(e->{ 

 
         primaryStage.close();  
         primaryStage.setScene(scene1); 
         primaryStage.setTitle("Log in"); 
         primaryStage.show();}); 
 
 
    Text text9 = new Text(35 , 45 ,"Please, Click on user type:"); 
    text9.setFill(Color.DARKSLATEGRAY); 
    text9.setFont(Font.font("Arial", FontWeight.BOLD, 15)); 
 
 
    Button female = new Button("Female"); 
    female.setPrefSize(150, 50); 
    female.setLayoutX(200); 
    female.setLayoutY(90); 
    female.setBackground(new Background(new BackgroundFill(Color.LAVENDER, 
new CornerRadii(15), null))); 
 
    Button male = new Button("Male"); 
    male.setPrefSize(150, 50); 
    male.setLayoutY(90);          
    male.setLayoutX(35); 
    male.setBackground(new Background(new BackgroundFill(Color.LAVENDER, new 
CornerRadii(15), null))); 
 
 
 
    Pane pane2 = new Pane(); 
    pane2.getChildren().addAll(text9 , female , male ); 
 
 
    Image image10 = new Image("store/theam10_.png"); 
    ImageView image11 = new ImageView(image10); 
    image11.setFitHeight(400); 
    image11.setFitWidth(70); 
    image11.setLayoutX(350); 
    pane2.getChildren().add(image11); 
 
 
    Scene scene2 = new Scene(pane2, 395, 200); 
    scene2.setFill(Color.LAVENDER); 
 
 
 
 
 
             // ActionEvent for login button 
    login.setOnAction(e->{ 
     if(textd1.getText().equals(custmor.getUsername())&& 
textd2.getText().equals(custmor.getPassword())) { 
    primaryStage.setScene(scene2); 
    primaryStage.setTitle("Femeale or Male"); 
    primaryStage.show(); 
            } 
     else{ 
     lable1.setText("username or password incorecet");  
 
 
     } // end of else  
     }); 
 
        // customer main menu screen 
    Text txt2=new Text(25,70,"Customer Menu"); 
    txt2.setFill(Color.DARKSLATEGREY); 
    Font myFont2=new Font("century gothic",25); 
    txt2.setFont(myFont2); 
 
 
    Button Hoodies = new Button(); 
    Hoodies.setText("Hoodies"); 
    Hoodies.setPrefSize(150, 50); 
    Hoodies.setLayoutX(80); 
    Hoodies.setLayoutY(90);      
    Hoodies.setBackground(new Background(new BackgroundFill(Color.LAVENDER, 
new CornerRadii(15), Insets.EMPTY))); 
    //button Clothes 
    Button shirt=new Button(); 
    shirt.setText("T-shirt"); 
    shirt.setPrefSize(150, 50); 
    shirt.setLayoutX(80); 
    shirt.setLayoutY(150);   
    shirt.setBackground(new Background(new BackgroundFill(Color.LAVENDER, new 
CornerRadii(15), Insets.EMPTY))); 
    //button exit 
    Button Pants=new Button(); 
    Pants.setText("Pants");  
    Pants.setPrefSize(150, 50); 
    Pants.setLayoutX(80); 
    Pants.setLayoutY(210); 
    Pants.setBackground(new Background(new BackgroundFill(Color.LAVENDER, new 
CornerRadii(15), Insets.EMPTY))); 
 
 
    Button btn00 = new Button(  "" , imageViews0[0]); 
    btn00.setBackground(new Background(new BackgroundFill(Color.LAVENDER, new 
CornerRadii(20), null))); 
    btn00.setLayoutX(270); 
    btn00.setLayoutY (220); 
 
 
    Pane pane3 = new Pane(); 
    pane3.getChildren().addAll(txt2,Hoodies,shirt,Pants , 
btn00); 
    Scene scene4 = new Scene(pane3, 350, 300); 
 
 
 
    female.setOnAction(e->{ 
 
    primaryStage.setScene(scene4); 
    primaryStage.setTitle("Menu"); 
    primaryStage.show();;}); 
 
    btn00.setOnAction(e->{     
    primaryStage.setScene(scene2); 

 
    primaryStage.setTitle("Femeale or Male");   
    primaryStage.show();;});  
 
 
 
 
//window 3 
    // Create the image views 
    ImageView[] imageViews = { 
             
        new ImageView(new Image("store/hoodie5.png")), 
        new ImageView(new Image("store/hoodie1.png")), 
        new ImageView(new Image("store/hoodie3.png")), 
        new ImageView(new Image("store/hoodie4.png")), 
        new ImageView(new Image("store/hoodie6.png")), 
        new ImageView(new Image("store/hoodie2.png")) 
    }; 
    for (ImageView imageView9 : imageViews) { 
        imageView9.setFitHeight(250); 
        imageView9.setFitWidth(400); 
    } 
     
     
    // Create size radio buttons 
    ToggleGroup sizeGroup = new ToggleGroup(); 
    RadioButton size1 = new RadioButton("S"); 
    size1.setToggleGroup(sizeGroup); 
    RadioButton size2 = new RadioButton("M"); 
    size2.setToggleGroup(sizeGroup); 
    RadioButton size3 = new RadioButton("L"); 
    size3.setToggleGroup(sizeGroup); 
    RadioButton size4 = new RadioButton("XL"); 
    size4.setToggleGroup(sizeGroup); 
 
    // Create color radio buttons 
    ToggleGroup colorGroup = new ToggleGroup(); 
    RadioButton color1 = new RadioButton("White"); 
    color1.setToggleGroup(colorGroup); 
    RadioButton color2 = new RadioButton("Gray"); 
    color2.setToggleGroup(colorGroup); 
    RadioButton color3 = new RadioButton("Green"); 
    color3.setToggleGroup(colorGroup); 
    RadioButton color4 = new RadioButton("Purple"); 
    color4.setToggleGroup(colorGroup); 
    RadioButton color5 = new RadioButton("Blue"); 
    color5.setToggleGroup(colorGroup); 
    RadioButton color6 = new RadioButton("Black"); 
    color6.setToggleGroup(colorGroup); 
 
    // Create price button 
    Text price = new Text("250SAR"); 
    price.setFill(Color.DARKSLATEGREY); 
    Font price1=new Font("century gothic",25); 
    price.setFont(price1); 
 
    // Create "Add to Cart" button 
    Button BuyButton = new Button("Buy it"); 
 
 
    BuyButton.setBackground(new Background(new BackgroundFill(Color.LAVENDER, 
new CornerRadii(20), null))); 
 
          Label label1 = new Label(); 
         label1.setTextFill(Color.RED); 
    // Arrange the components 
    GridPane gridPane = new GridPane(); 
 
    HBox sizeBox = new HBox(size1, size2, size3, size4 , label1); 
    sizeBox.setSpacing(10); 
 
    VBox colorBox = new VBox(color1, color2, color3, color4, color5, color6); 
    colorBox.setSpacing(10); 
     
        Button btn0 = new Button(  "" , imageViews0[1]); 
        btn0.setBackground(new Background(new BackgroundFill(Color.BEIGE, new 
CornerRadii(20), null))); 
        gridPane.add(btn0 ,2 , 4); 
   
 
        gridPane.add(imageViews[0] , 1,0); 
        gridPane.addColumn(0, colorBox); 
        gridPane.add(sizeBox, 1, 2 ); 
        gridPane.add(price, 1, 1); 
        gridPane.add(BuyButton, 1, 4); 
 
        Scene scene3 = new Scene(gridPane, 520, 350); 
         Hoodies.setOnAction(e->{ 
 
        primaryStage.setScene(scene3); 
        primaryStage.setTitle("Product Display"); 
        primaryStage.show();;}); 
          
        btn0.setOnAction(e->{     
        primaryStage.setScene(scene4); 
        primaryStage.setTitle("Menu"); 
        primaryStage.show();;});   
           
           
  color1.setOnAction(e->{ 
      if(color1.isSelected()){ 
          gridPane.getChildren().remove(imageViews[0]); 
          gridPane.getChildren().remove(imageViews[1]); 
          gridPane.getChildren().remove(imageViews[2]); 
          gridPane.getChildren().remove(imageViews[3]); 
          gridPane.getChildren().remove(imageViews[4]); 
          gridPane.getChildren().remove(imageViews[5]); 
           
          gridPane.add(imageViews[1] , 1,0);  
       
      } 
  }); 
   
  color2.setOnAction(e->{ 
      if(color2.isSelected()){ 
          gridPane.getChildren().remove(imageViews[0]); 
          gridPane.getChildren().remove(imageViews[1]); 

 
          gridPane.getChildren().remove(imageViews[2]); 
          gridPane.getChildren().remove(imageViews[3]); 
          gridPane.getChildren().remove(imageViews[4]); 
 
          gridPane.add(imageViews[2] , 1,0); 
      } 
  }); 
   
    color3.setOnAction(e->{ 
      if(color3.isSelected()){ 
          gridPane.getChildren().remove(imageViews[0]); 
          gridPane.getChildren().remove(imageViews[1]); 
          gridPane.getChildren().remove(imageViews[2]); 
          gridPane.getChildren().remove(imageViews[3]); 
          gridPane.getChildren().remove(imageViews[4]); 
          gridPane.getChildren().remove(imageViews[5]); 
 
          gridPane.add(imageViews[3] , 1,0); 
      } 
  }); 
     
      color4.setOnAction(e->{ 
      if(color4.isSelected()){ 
          gridPane.getChildren().remove(imageViews[0]); 
          gridPane.getChildren().remove(imageViews[1]); 
          gridPane.getChildren().remove(imageViews[2]); 
          gridPane.getChildren().remove(imageViews[3]); 
          gridPane.getChildren().remove(imageViews[4]); 
          gridPane.getChildren().remove(imageViews[5]); 
 
          gridPane.add(imageViews[4] , 1,0); 
      } 
  }); 
       
      color5.setOnAction(e->{ 
      if(color5.isSelected()){ 
          gridPane.getChildren().remove(imageViews[0]); 
          gridPane.getChildren().remove(imageViews[1]); 
          gridPane.getChildren().remove(imageViews[2]); 
          gridPane.getChildren().remove(imageViews[3]); 
          gridPane.getChildren().remove(imageViews[4]); 
          gridPane.getChildren().remove(imageViews[5]); 
 
          gridPane.add(imageViews[5] , 1,0);  
      } 
  }); 
       
            color6.setOnAction(e->{ 
      if(color6.isSelected()){ 
          gridPane.getChildren().remove(imageViews[0]); 
          gridPane.getChildren().remove(imageViews[1]); 
          gridPane.getChildren().remove(imageViews[2]); 
          gridPane.getChildren().remove(imageViews[3]); 
          gridPane.getChildren().remove(imageViews[4]); 
          gridPane.getChildren().remove(imageViews[5]); 
 
          gridPane.add(imageViews[0] , 1,0); 

      } 
  }); 
     
      
   
          // Generate a random order number 
        int orderNumber = new Random().nextInt(100000); 
 
        // Create the order completion screen 
        VBox root = new VBox(15); 
        root.setAlignment(Pos.CENTER); 
 
        // Set the font for the order number label 
        Label orderNumberl = new Label("Your order number is: " + 
orderNumber); 
        orderNumberl.setFont(Font.font("Arial", FontWeight.BOLD, 16)); 
        orderNumberl.setTextFill(Color.PURPLE); 
        
 
        // Set the font for the message label 
        Label messageLabel = new Label("Thank you for your order.\nYour order 
will be processed shortly."); 
        messageLabel.setFont(Font.font("Arial", 14)); 
        messageLabel.setTextFill(Color.GRAY); 
 
        root.getChildren().addAll(orderNumberl, messageLabel); 
 
        // Set the scene background color to lavender 
        Scene scene9 = new Scene(root, 400, 150); 
        scene9.setFill(Color.LAVENDER); 
         
          
           BuyButton.setOnAction(r -> { 
        if (size1.isSelected() || size2.isSelected() || size3.isSelected() || 
size4.isSelected()) { 
            primaryStage.setScene(scene9); 
            primaryStage.setTitle("Order Completion"); 
            primaryStage.show(); 
        } else { 
            System.out.println("You must select a size first!"); 
            label1.setText("Select a size!"); 
        } 
    }); 
    
       
//window 4 
    // Create the image views 
    ImageView[] imageViews1 = {  
             
        new ImageView(new Image("store/tshirt.png")), 
        new ImageView(new Image("store/tshirt1.png")), 
        new ImageView(new Image("store/tshirt2.png")), 
        new ImageView(new Image("store/tshirt3.png")), 
        new ImageView(new Image("store/tshirt4.png")), 
        new ImageView(new Image("store/tshirt5.png")) 
    }; 
    for (ImageView imageView9 : imageViews1) { 

 
        imageView9.setFitHeight(250); 
        imageView9.setFitWidth(400); 
    } 
     
     
    // Create size radio buttons 
    ToggleGroup sizeGroup1 = new ToggleGroup(); 
    RadioButton size11 = new RadioButton("S"); 
    size11.setToggleGroup(sizeGroup1); 
    RadioButton size22 = new RadioButton("M"); 
    size22.setToggleGroup(sizeGroup1); 
    RadioButton size33 = new RadioButton("L"); 
    size33.setToggleGroup(sizeGroup1); 
    RadioButton size44 = new RadioButton("XL"); 
    size44.setToggleGroup(sizeGroup1); 
 
    // Create color radio buttons 
    ToggleGroup colorGroup1 = new ToggleGroup(); 
    RadioButton color11 = new RadioButton("Light Blue"); 
    color11.setToggleGroup(colorGroup1); 
    RadioButton color22 = new RadioButton("White"); 
    color22.setToggleGroup(colorGroup1); 
    RadioButton color33 = new RadioButton("Pink"); 
    color33.setToggleGroup(colorGroup1); 
    RadioButton color44 = new RadioButton("Purple"); 
    color44.setToggleGroup(colorGroup1); 
    RadioButton color55 = new RadioButton("Green"); 
    color55.setToggleGroup(colorGroup1); 
    RadioButton color66 = new RadioButton("Black"); 
    color66.setToggleGroup(colorGroup1); 
 
    // Create price button 
    Text price2 = new Text("150SAR"); 
    price2.setFill(Color.DARKSLATEGREY); 
    Font price3=new Font("century gothic",30); 
    price.setFont(price3); 
     
 
 
        // Create "Add to Cart" button 
        Button BuyButton2 = new Button("Buy it"); 
        BuyButton2.setBackground(new Background(new 
BackgroundFill(Color.LAVENDER, new CornerRadii(20), null))); 
 
         Label label2 = new Label(); 
         label2.setTextFill(Color.RED); 
    
         GridPane gridPane2 = new GridPane(); 
 
        HBox sizeBox2 = new HBox(size11, size22, size33, size44 
, label2); 
        sizeBox.setSpacing(10); 
 
        VBox colorBox2 = new VBox(color11, color22, color33, 
color44, color55, color66); 
        colorBox.setSpacing(10); 
 

 
        gridPane2.add(imageViews1[0] , 1,0); 
        gridPane2.addColumn(0, colorBox2); 
        gridPane2.add(sizeBox2, 1, 2 ); 
        gridPane2.add(price2, 1, 1); 
        gridPane2.add(BuyButton2, 1, 4); 
         
 
         
        Button btn3 = new Button(  "" , imageViews0[2]); 
        btn3.setBackground(new Background(new BackgroundFill(Color.BEIGE, new 
CornerRadii(20), null))); 
        gridPane2.add(btn3 ,2 , 4 ); 
 
        Scene scene5 = new Scene(gridPane2, 520, 350); 
         
        shirt.setOnAction(e->{ 
        primaryStage.setScene(scene5); 
        primaryStage.setTitle("Product Display"); 
        primaryStage.show();;}); 
         
        btn3.setOnAction(e->{     
        primaryStage.setScene(scene4); 
        primaryStage.setTitle("Menu"); 
        primaryStage.show();;});    
         
         
           
  color11.setOnAction(e->{ 
      if(color11.isSelected()){ 
          gridPane2.getChildren().remove(imageViews1[0]); 
          gridPane2.getChildren().remove(imageViews1[1]); 
          gridPane2.getChildren().remove(imageViews1[2]); 
          gridPane2.getChildren().remove(imageViews1[3]); 
          gridPane2.getChildren().remove(imageViews1[4]); 
          gridPane2.getChildren().remove(imageViews1[5]); 
           
          gridPane2.add(imageViews1[0] , 1,0); 
       
      } 
  }); 
   
  color22.setOnAction(e->{ 
      if(color22.isSelected()){ 
          gridPane2.getChildren().remove(imageViews1[0]); 
          gridPane2.getChildren().remove(imageViews1[1]); 
          gridPane2.getChildren().remove(imageViews1[2]); 
          gridPane2.getChildren().remove(imageViews1[3]); 
          gridPane2.getChildren().remove(imageViews1[4]); 
          gridPane2.getChildren().remove(imageViews1[5]); 
 
          gridPane2.add(imageViews1[1] , 1,0);  
      } 
  }); 
   
    color33.setOnAction(e->{ 
      if(color33.isSelected()){ 
          gridPane2.getChildren().remove(imageViews1[0]); 

 
          gridPane2.getChildren().remove(imageViews1[1]); 
          gridPane2.getChildren().remove(imageViews1[2]); 
          gridPane2.getChildren().remove(imageViews1[3]); 
          gridPane2.getChildren().remove(imageViews1[4]); 
          gridPane2.getChildren().remove(imageViews1[5]); 
 
          gridPane2.add(imageViews1[2] , 1,0); 
      } 
  }); 
     
      color44.setOnAction(e->{ 
      if(color44.isSelected()){ 
          gridPane2.getChildren().remove(imageViews1[0]); 
          gridPane2.getChildren().remove(imageViews1[1]); 
          gridPane2.getChildren().remove(imageViews1[2]); 
          gridPane2.getChildren().remove(imageViews1[3]); 
          gridPane2.getChildren().remove(imageViews1[4]); 
          gridPane2.getChildren().remove(imageViews1[5]); 
 
          gridPane2.add(imageViews1[3] , 1,0); 
      } 
  }); 
       
      color55.setOnAction(e->{ 
      if(color55.isSelected()){ 
          gridPane2.getChildren().remove(imageViews1[0]); 
          gridPane2.getChildren().remove(imageViews1[1]); 
          gridPane2.getChildren().remove(imageViews1[2]); 
          gridPane2.getChildren().remove(imageViews1[3]); 
          gridPane2.getChildren().remove(imageViews1[4]); 
          gridPane2.getChildren().remove(imageViews1[5]); 
 
          gridPane2.add(imageViews1[4] , 1,0); 
      } 
  }); 
       
            color66.setOnAction(e->{ 
      if(color66.isSelected()){ 
          gridPane2.getChildren().remove(imageViews1[0]); 
          gridPane2.getChildren().remove(imageViews1[1]); 
          gridPane2.getChildren().remove(imageViews1[2]); 
          gridPane2.getChildren().remove(imageViews1[3]); 
          gridPane2.getChildren().remove(imageViews1[4]); 
          gridPane2.getChildren().remove(imageViews1[5]); 
          gridPane2.add(imageViews1[5] , 1,0); 
      } 
  }); 
     

 
             BuyButton2.setOnAction(r -> { 
        if (size11.isSelected() || size22.isSelected() || size33.isSelected() 
|| size44.isSelected()) { 
            primaryStage.setScene(scene9); 
            primaryStage.setTitle("Order Completion"); 
            primaryStage.show(); 
        } else { 
            System.out.println("You must select a size first!"); 
            label2.setText("Select a size!"); 
        } 
    });    
 
   
   
} 
 
    
 
    public static void main(String[] args) { 
        launch(args); 
    } } 
     
