package Issue02;

import java.util.List;

public class Storage {
    private String vendorName;
    private String storageName;

    public Storage(String vendorName, String storageName) {
        this.vendorName = vendorName;
        this.storageName = storageName;
    }

    public void currentInfo() {
        System.out.println("ベンダーは" + this.vendorName + "。" + "ストレージの名前は" + this.storageName + "。");
    }

    public void changeVendor(String vendorName) {
        this.vendorName = vendorName;
        if (vendorName == "AWS") {
            this.storageName = "Simple Storage Service";
        } else if (vendorName == "GCP") {
            this.storageName = "GCS";
        } else if (vendorName == "Azure") {
            this.storageName = "Azure Blob Storage";
        }
        System.out.println("ベンダーが" + this.vendorName + "に変更されました。ストレージを" + this.storageName + "変更しました。");

    }

    public void showStorageNamesBy(List<String> vendorList) {
        System.out.println("ストレージサービスの一覧を表示します。");
        for (String vendorName : vendorList) {
            if (vendorName == "AWS") {
                System.out.println("Simple Storage Service");
            } else if (vendorName == "GCP") {
                System.out.println("GCS");
            } else if (vendorName == "Azure") {
                System.out.println("Azure Blob Storage");
            }
        }
    }

    public String getVendorName() {
        return vendorName;
    }

    public String getStorageName() {
        return storageName;
    }

}
