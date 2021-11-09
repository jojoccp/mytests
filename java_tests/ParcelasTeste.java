public class ParcelasTeste {


    public static void main(String[] args) {
        int parcels = 6;
        double value = 1200.00;
        double downPayment = 200.00;
        double selicRate = 0.0115;
        double valueParcels = value-downPayment;


        double taxaAdicionada =  valueParcels + (valueParcels * selicRate);
        double parcelValue = 0;


        for(int i = 1; i <= parcels; i++){

            if(parcels >= 6){
                parcelValue = taxaAdicionada/parcels;
            } else {
                selicRate = 0;
            }



            System.out.println("Numero da Parcela "+ i + "Valor da parcela: " + parcelValue +
                    "Valor de Juros: " + selicRate);



        }
    }
}
