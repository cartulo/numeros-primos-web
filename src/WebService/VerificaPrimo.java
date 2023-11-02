package WebService;

public class VerificaPrimo {
    public static String verificarPrimo(java.lang.String numero)
    {
        org.tempuri.Service1 service = new org.tempuri.Service1();
        org.tempuri.IService1 interfaceService = service.getBasicHttpBindingIService1();
        return interfaceService.verificarNumeroPrimo(numero);
    }
}
