package javafx1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ProductCrud {
    public TextField txtProduct;
    public TextField txtPrice;
    public TextField txtQuantity;
    public TextField txtDescribe;
    public TextField txtCategory;
    public static ObservableList<Product2> listPros = FXCollections.observableArrayList();
    public ListView<Product2> listView1;
    public static Product2 editPro;


    public void submit(ActionEvent actionEvent) {
        try {
            String name = txtProduct.getText();
            String price = txtPrice.getText();
            String quantity = txtQuantity.getText();
            String describe = txtDescribe.getText();
            String category = txtCategory.getText();

            if (editPro != null){
                editPro.setName(name);
                editPro.setPrice(price);
                editPro.setQuantity(quantity);
                editPro.setDescribe(describe);
                editPro.setCategory(category);

                listView1.setItems(listPros);
                listView1.refresh();
                editPro = null;

                clear();
            }
            for (Product2 p2 : listPros){
                if (p2.getName().equals(name));
                throw new Exception("Name này đã tồn tại");
            }
            Product2 pd2 = new Product2(name, price, quantity, describe, category);
            listPros.add(pd2);
            listView1.setItems(listPros);
            clear();

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }

    public void editPro(MouseEvent mouseEvent) {
        editPro = listView1.getSelectionModel().getSelectedItem();
        if (editPro != null){
            txtProduct.setText(editPro.getName());
            txtPrice.setText(editPro.getPrice());
            txtQuantity.setText(editPro.getQuantity());
            txtDescribe.setText(editPro.getDescribe());
            txtCategory.setText(editPro.getCategory());
        }
    }

    public void delete(ActionEvent actionEvent) {
      ObservableList<Product2> allProduct, SingleProduct;
      allProduct = listView1.getItems();
      SingleProduct = listView1.getSelectionModel().getSelectedItems();
      SingleProduct.forEach(allProduct::remove);
      clear();
    }
    public void clear(){
        txtProduct.clear();
        txtPrice.clear();
        txtQuantity.clear();
        txtDescribe.clear();
        txtCategory.clear();
    }

}
