//package GUI.w12;
//
//import javafx.beans.InvalidationListener;
//import javafx.beans.Observable;
//import javafx.beans.binding.DoubleBinding;
//import javafx.beans.binding.NumberBinding;
//import javafx.beans.property.*;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//
//public class Main {
//
//    public static void main(String[] args) {
//        StringProperty pass = new SimpleStringProperty("qwe123");
//        pass.setValue("1234");
//
//        pass.set("5678");
//        pass.get();
//        pass.getValue();
//
//        PersonProp pp = new PersonProp();
//        //pp.setName("");
//
//        ReadOnlyStringWrapper userName = new ReadOnlyStringWrapper("jtk");
//        userName.setValue("laisjdlija");
//        System.out.println(userName.getValue());
//
//        pass.addListener(
//            new ChangeListener<String>() {
//                @Override
//                public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
//                    System.out.println("changed()\t"+pass.get());
//                }
//            }
//        );
//
//        pass.addListener(
//            new InvalidationListener() {
//                @Override
//                public void invalidated(Observable observable) {
//                    System.out.println("invalidated()\t"+pass.get() );
//                }
//            }
//        );
//
//        pass.setValue("1234");
//
//        pass.set("5678");
//        pass.get();
//        pass.getValue();
//
//// ==================================
//
//        int i = 5;
//        i *= 5;
//
//
//        IntegerProperty width = new SimpleIntegerProperty(10);
//        IntegerProperty height = new SimpleIntegerProperty(10);
//
//        NumberBinding area = width.multiply(height);
//
//        System.out.println(
//            area.getValue()
//        );
//
//        width.set(15);
//
//        System.out.println(
//                area.getValue()
//        );
//
//// =====================
//
//        // 4/3 * pi * r^3
//
//
//        DoubleProperty radius = new SimpleDoubleProperty(2);
//
//        DoubleBinding volumeOfSphere;
//
//        volumeOfSphere = new DoubleBinding() {
//            {
//                super.bind(radius);
//            }
//
//            @Override
//            protected double computeValue() {
//                return (4/3.0 * Math.PI * Math.pow(radius.get(), 3));
//            }
//        };
//
//        System.out.println(
//            volumeOfSphere.get()
//        );
//
//        radius.set(3);
//
//        System.out.println(
//                volumeOfSphere.get()
//        );
//
//    }
//}
