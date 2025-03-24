import java.util.*;
class CPU
{
  int price;
  public CPU(int price)
   {
     this.price=price;
   }
  class Processor
   {
     int cores;
     String manufacturer;
     Processor(int cores,String manufacturer)                                                                                                                                                                 
      {       
        this.cores=cores;
        this.manufacturer=manufacturer;
      }
      void display_ProcessorInfo()
       {
         System.out.println("Processor cores:"+cores);
         System.out.println("Processor manufacturer:"+manufacturer);
       }
   }
  static class RAM
   {
     int memory;
     String manufacturer;
     RAM(int memory,String manufacturer)
      { 
        this.memory=memory;
        this.manufacturer=manufacturer;
      }
        void display_RamInfo()
         {
           System.out.println("Memory:"+memory +"GB");
           System.out.println("RAM manufacturer:"+manufacturer);
         }
   }
     public static void main(String args[])
       {
         CPU cpu=new CPU(20000);
         CPU.Processor p=cpu.new Processor(7,"Intel");
         CPU.RAM ram=new CPU.RAM(16,"AAA");
         System.out.println("CPU price:"+cpu.price);
         p.display_ProcessorInfo();
         ram.display_RamInfo();
       }
}  
