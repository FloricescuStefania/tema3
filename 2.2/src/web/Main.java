package web;

/* Utilizați Singleton Pattern într-o clasă WebHelper care are o singura metoda:
String getWebSiteContent(). Aceasta metoda returnează conținutul unei aceleiași pagini web
(url-ul poate fi hard codat în clasă). Pagina web este încărcată o singură data,
la prima accesare a metodei getWebSiteContent(). Utilizați getWebSiteContent()
într-o aplicație Java . */
// SINGLETON PATTERN

public class Main {
    public static void main(String[] args) {

        WebHelper webHelper = new WebHelper();

        String webContent = webHelper.getWebSiteContent();

        System.out.println(webContent);
    }
}