package Issue02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Storageクラスからインスタンスを生成
        Storage storage = new Storage("AWS", "Simple Storage Service");
        storage.currentInfo();

        //changeVendorメソッドを使用して引数のベンダー名称に対応したストレージサービス名に変更
        storage.changeVendor("GCP");
        storage.currentInfo();

        //checkStorageNamesメソッドで引数にリストをとり、ストレージサービス名称の一覧を表示git
        List<String> vendorList = new ArrayList<>();
        vendorList.add("GCP");
        vendorList.add("Azure");
        vendorList.add("AWS");
        storage.checkStorageNames(vendorList);

    }

}
