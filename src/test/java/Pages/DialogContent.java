package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Media Markt']")
    private WebElement verifyHomePage;

    @FindBy(name = "query")
    private WebElement searchInput;

    @FindBy(xpath = "//p[@class='product-categories']/following-sibling::a/child::p[@class='product-title'][starts-with(@title,'Jbl')]")
    private List<WebElement> productSelection;

    @FindBy(name = "2")
    private WebElement additionalInsurance;

    @FindBy(id = "sepete-ekle-devam-et")
    private WebElement AddAndContinueButton;


    @FindBy(xpath = "//span[text()='Devam']")
    private WebElement continueButton;

    @FindBy(id = "without_member1")
    private WebElement withoutRegistrationButton;

    @FindBy(id = "userForm-email")
    private WebElement withoutRegistrationEmailInput;

    @FindBy(xpath = "//*[@id='nextButton']")
    public WebElement continueButton2; //kaydet butonu ile aynı

    @FindBy(id = "radio-male")
    private WebElement radioButtonMale;

    @FindBy(name = "taxId")
    private WebElement taxIdInput;

    @FindBy(name = "firstName")
    private WebElement firstNameInput;

    @FindBy(name = "lastName")
    private WebElement lastNameInput;

    @FindBy(name = "street")
    private WebElement streetInput;

    @FindBy(name = "addressAddition")
    private WebElement addressAdditionInput;

    @FindBy(xpath = "(//select[@name='remoteOptions'])[1]")
    public WebElement selectOptions1;

    @FindBy(xpath = "(//select[@name='remoteOptions'])[2]")
    public WebElement selectOptions2;

    @FindBy(xpath = "(//select[@name='remoteOptions'])[3]")
    public WebElement selectOptions3;

    @FindBy(name = "mobile")
    private WebElement mobileInput;

    @FindBy(xpath = "(//select[@ng-model='vm.value'])[1]")
    public WebElement selectDay;

    @FindBy(xpath = "(//select[@ng-model='vm.value'])[2]")
    public WebElement selectMonth;

    @FindBy(xpath = "(//select[@ng-model='vm.value'])[3]")
    public WebElement selectYear;

    @FindBy(xpath = "//*[@class='coform-checkbox']")
    public WebElement contractCheckButton;

    @FindBy(name = "customerContract")
    private WebElement saveButton;

    @FindBy(css = "button[class$='cobutton-next']")
    public WebElement continueButton3;

    @FindBy(className = "cproduct-actions-remove")
    private WebElement removeProductButton;

    @FindBy(xpath = "//h3[text()='Sepetinizde ürün bulunmuyor']")
    public WebElement verifyNoItems;

    @FindBy(xpath = "//img[@alt='MediaTrend']")
    private WebElement mediaTrendImg;

    @FindBy(css = "button[type='button'][class='layer-close']")
    private WebElement mediaTrendVideoCloseButton;

    @FindBy(className = "alignnone")
    private WebElement downloadMagazineImg;

    @FindBy(xpath = "//button[@data-identifier='searchButton']")
    public WebElement searchButton;

    @FindBy(xpath = "//h3[text()='Kişisel Bakım']")
    public WebElement kisiselBakim;

    @FindBy(xpath = "//span[text()='Anladım']")
    public WebElement anladim;

    @FindBy(xpath = "(//map[@name='map_11384544_h1w4']/area)[1]")
    public WebElement erkekBakimUrunleri;

    @FindBy(xpath = "//button[text()='En Yüksek Fiyat']")
    public WebElement enYuksekFiyat;

    @FindBy(xpath = "(//ul[@class='products-list']/li//img)[1]")
    public WebElement enPahaliErkekBakimUrunu;

    @FindBy(xpath = "//a[contains(text(),'Stok Sorgulama')]")
    public WebElement stokSorgulamaBtn;

    @FindBy(xpath = "//div[@class='search-box-holder']//input")
    public WebElement stokSorgulamaArama;

    ///ORCUN//////////////////////////////////
    @FindBy(xpath = "//a[text()='Tüm Kategoriler']")
    public WebElement categories;

    @FindBy(css = "span[class^='site-navigation2__link-label']")
    public List<WebElement> list;

    @FindBy(css = "span[class^='site-navigation2__link-label']")
    public WebElement compare1;

    @FindBy(xpath = "//span[text()='Hesabım']")
    public WebElement hesabım;

    @FindBy(css = "a[data-tracking=\"login\"]")
    public WebElement uyeOl;

    @FindBy(id = "tqa_register_personTitleMrs")
    public WebElement cinsiyet;

    //yazı
    @FindBy(name = "firstName")
    public WebElement name;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "phone2")
    public WebElement phone;

    @FindBy(name = "email1")
    public WebElement eposta;

    @FindBy(name = "logonPassword")
    public WebElement password;

    @FindBy(name = "logonPasswordVerify")
    public WebElement passwordAgain;

    @FindBy(name = "isNewsletterAtRegistrationActive")
    public WebElement sozlesmeOnay;

    @FindBy(id = "my-account-register-submit")
    public WebElement submitButton;

    @FindBy(css = "span[data-identifier=\"myprofile_salutation_line1\"]")
    public WebElement hesapDogrulama;

    @FindBy(xpath = "//span[text()='Anladım']")
    public WebElement pupup;

    @FindBy(xpath = "//*[text()='En Yüksek Fiyat']")
    public WebElement mostExpensivePrice;

    @FindBy(xpath = "//*[@title='Samsung 85Qn900B 85']")
    public WebElement mostExpensiveTV;

    @FindBy(xpath = "//*[@class='cocheckout-actions']")
    public WebElement devam;


    @FindBy(css = "[data-identifier='category-tree-navigation']")
    public WebElement AllCategories;

    @FindBy(xpath = "(//span[contains(text(),'Bilgisayar')])[1]")
    public WebElement Computer01;

    @FindBy(xpath = "(//span[contains(text(),'Laptop Aksesuarları')])[1]")
    public WebElement laptopAccesiors;

    @FindBy(xpath = "//span[text()='Anladım']")
    public WebElement cookieOk;

    @FindBy(xpath = "(//input[@class='facet-search'])[1]")
    public WebElement brandSearch;

    @FindBy(xpath = "//input[contains(@value,'filterbrand=DAYTONA')]")
    public WebElement daytona;

    @FindBy(xpath = "//a[contains(text(),'DAYTONA DYT803 Ayarlanabilir Taşınabiilir Aluminyum Laptop Standı Gümüş')]")
    public WebElement DAYTONADYT803;

    @FindBy(xpath = "(//a[contains(text(),'Mağaza Stok Durumu')])[1]")
    public WebElement stokStation;

    @FindBy(xpath = "//h3[contains(text(),'İSTANBUL | ÖZDİLEK PARK AVM')]")
    public WebElement ozdilekAVM;

    @FindBy(xpath = "//iframe[contains(@title,'Stok Durumu Görüntüle')]")
    public WebElement frameStokMap;

    @FindBy(css = "g[data-name='close']")
    public WebElement closedStok;

    @FindBy(css = "[id='pdp-add-to-cart']")
    public WebElement addToCartDayota;

    @FindBy(css = "[class='cototal-price ng-binding']")
    public WebElement productPrice;

    @FindBy(xpath = "//*[@name='customerContract']")
    public WebElement littleCheck;

    WebElement myElement;

    public void findAndSend(String strElement, String value) {

        switch (strElement) {

            case "searchInput":
                myElement = searchInput;
                break;

            case "withoutRegistrationEmailInput":
                myElement = withoutRegistrationEmailInput;
                break;

            case "taxIdInput":
                myElement = taxIdInput;
                break;

            case "firstNameInput":
                myElement = firstNameInput;
                break;

            case "lastNameInput":
                myElement = lastNameInput;
                break;

            case "streetInput":
                myElement = streetInput;
                break;

            case "addressAdditionInput":
                myElement = addressAdditionInput;
                break;
            case "mobileInput":
                myElement = mobileInput;
                break;
            case "stokSorgulamaArama":
                myElement = stokSorgulamaArama;
                break;

            case "name":
                myElement = name;
                break;

            case "lastName":
                myElement = lastName;
                break;

            case "phone":
                myElement = phone;
                break;

            case "eposta":
                myElement = eposta;
                break;

            case "password":
                myElement = password;
                break;

            case "passwordAgain":
                myElement = passwordAgain;
                break;

            case "brandSearch":
                myElement = brandSearch;
                break;





        }

        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {
        int rnd = (int) (Math.random() * productSelection.size());


        switch (strElement) {

            case "productSelection":
                myElement = productSelection.get(rnd);
                break;

            case "additionalInsurance":
                myElement = additionalInsurance;
                break;

            case "AddAndContinueButton":
                myElement = AddAndContinueButton;
                break;


            case "continueButton":
                myElement = continueButton;
                break;


            case "withoutRegistrationButton":
                myElement = withoutRegistrationButton;
                break;


            case "continueButton2":
                myElement = continueButton2;
                break;


            case "radioButtonMale":
                myElement = radioButtonMale;
                break;

            case "contractCheckButton":
                myElement = contractCheckButton;
                break;

            case "continueButton3":
                myElement = continueButton3;
                break;

            case "removeProductButton":
                myElement = removeProductButton;
                break;

            case "mediaTrendImg":
                myElement = mediaTrendImg;
                break;

            case "downloadMagazineImg":
                myElement = downloadMagazineImg;
                break;

            case "mediaTrendVideoCloseButton":
                myElement = mediaTrendVideoCloseButton;
                break;


            case "searchButton":
                myElement = searchButton;
                break;

            case "anladim":
                myElement = anladim;
                break;

            case "kisiselBakim":
                myElement = kisiselBakim;
                break;

            case "erkekBakimUrunleri":
                myElement = erkekBakimUrunleri;
                break;

            case "enYuksekFiyat":
                myElement = enYuksekFiyat;
                break;

            case "enPahaliErkekBakimUrunu":
                myElement = enPahaliErkekBakimUrunu;
                break;

            case "stokSorgulamaBtn":
                myElement = stokSorgulamaBtn;
                break;

            case "hesabım":
                myElement = hesabım;
                break;

            case "uyeOl":
                myElement = uyeOl;
                break;

            case "cinsiyet":
                myElement = cinsiyet;
                break;

            case "sozlesmeOnay":
                myElement = sozlesmeOnay;
                break;

            case "submitButton":
                myElement = submitButton;
                break;

            case "pupup":
                myElement = pupup;
                break;

            case "mostExpensivePrice":
                myElement = mostExpensivePrice;
                break;

            case "mostExpensiveTV":
                myElement = mostExpensiveTV;
                break;

            case "devam":
                myElement = devam;
                break;


            case "laptopAccesiors":
                myElement = laptopAccesiors;
                break;

            case "cookieOk":
                myElement = cookieOk;
                break;

            case "daytona":
                myElement = daytona;
                break;

            case "DAYTONADYT803":
                myElement = DAYTONADYT803;
                break;

            case "stokStation":
                myElement = stokStation;
                break;

            case "closedStok":
                myElement = closedStok;
                break;

            case "addToCartDayota":
                myElement = addToCartDayota;
                break;

            case "littleCheck":
                myElement = littleCheck;
                break;

        }

        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {

        switch (strElement) {

            case "verifyHomePage":
                myElement = verifyHomePage;
                break;
            case "verifyNoItems":
                myElement = verifyNoItems;
                break;

            case "hesapDogrulama":
                myElement = hesapDogrulama;
                break;

        }

        verifyContainsText(myElement, text);
    }

}
