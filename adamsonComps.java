public class adamsonComps {

	public static void main(String[] args) {
		System.out.println("************************Adamson Computers Ltd************************");
		System.out.println("#99 ACS Building Gilmore Ave. New Mla.. Quezon City * Tel. No:123-4567");
		System.out.println("\t\tVAT REG. TIN 098-765-4321-0000\t\t\t\t");
		System.out.println("\t\t\tSALES INVOICE");
		String[] invoiceDetails= {"Sold to","Date","Address","Contact Number","Qty","Item Description","Unit Price","Amount","Sub total","VAT(16%)","Total Amount"};
		String regNO="C026-01-0935/2022";
		String fullName="Kyalo Josephine Kathini";
			System.out.print(invoiceDetails[0]+":"+regNO);
			System.out.println("\t\t\t\t"+invoiceDetails[1]+":28/04/2020");
			System.out.print(invoiceDetails[2]+":"+fullName);
			System.out.println("\t\t\t\t"+invoiceDetails[3]+":0100100100");
			System.out.println("");
			System.out.println("====================================================================================");
			System.out.print(invoiceDetails[4]+"\t|");
			System.out.print("\t"+invoiceDetails[5]+"\t|");
			System.out.print("\t"+invoiceDetails[6]+"\t|");
			System.out.println(invoiceDetails[7]);
			System.out.println("=====================================================================================");
			int[] quantity= {4,10,9,10};
				System.out.print(quantity[0]+"\t|\t");
			System.out.print("Pencil\t\t\t|\t20\t\t|");
			double[] money={80.0,500.00,270.00,800.00};
			System.out.println(money[0]);
			System.out.println("-------------------------------------------------------------------------------------");
			    System.out.println(quantity[1]+"\t|\tDuster\t\t\t|\t50\t\t|"+money[1]);
			System.out.println("-------------------------------------------------------------------------------------");
			    System.out.println(quantity[2]+"\t|\tPens\t\t\t|\t30\t\t|"+money[2]);
			System.out.println("-------------------------------------------------------------------------------------");
			    System.out.println(quantity[3]+"\t|\tcrayon\t\t\t|\t80\t\t|"+money[3]);
			System.out.println("=====================================================================================");
		double totalSum=money[0]+money[1]+money[2]+money[3];
		double vat=totalSum*0.16;
		double allAmount=totalSum+vat;
	    System.out.println("\t\t\t\t\t\t|"+invoiceDetails[8]+"\t|"+totalSum);
	    System.out.println("\t\t\t\t\t\t======================================");
	    System.out.println("\t\t\t\t\t\t|"+invoiceDetails[9]+"\t|"+vat);
	    System.out.println("\t\t\t\t\t\t======================================");
	    System.out.println("\t\t\t\t\t\t|"+invoiceDetails[10]+"\t|"+allAmount);
	    System.out.println("\t\t\t\t\t\t======================================");
			
			}
			
			
		}