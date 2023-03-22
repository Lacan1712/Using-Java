/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lacan.bancoex;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author lacan
 */

public class BancoConta {
    
    //Dados cadastrais
    private int     numConta;
    public  boolean tipoConta;//false = CC e true = CP
    private String  cliente;
    private double  saldo;
    private boolean status;
    //=======================
    //Métodos
    void abrirConta(){
        //declaração das classes io e variáveis
        Scanner nome = new Scanner(System.in);
        Scanner op = new Scanner(System.in);
        Random nConta = new Random();
        int conta;
        //implementação
        System.out.println("BEM VINDO AO BANCO EX!");
        System.out.println("Teremos o prazer de abrir a sua conta.");
        System.out.println("Digite agora o seu nome completo: ");
        this.cliente = nome.nextLine();
        System.out.println("Agora selecione o tipo da conta:");
        System.out.println("[1]Conta Corrente");
        System.out.println("[2]Conta Poupança (Bonus de 100$ para criação da conta)");
        System.out.println("Digite sua opção: ");
        conta = op.nextInt();
        if(conta == 1){
            setTipoConta(false);
            setStatus(true);
            this.numConta = nConta.nextInt((19999-1999)+1)+1999;//gera número aleatório entre 19999 e 1999
            System.out.println("Parabéns sua Conta Corrente foi criada!");
            System.out.println("Número da Conta Corrente "+this.numConta);
        }else if(conta == 2){
            setTipoConta(true);
            setStatus(true);
            this.numConta = nConta.nextInt((19999-1999)+1)+1999;//gera número aleatório entre 19999 e 1999
            setSaldo(100);
            System.out.println("Parabéns sua Conta Poupança foi criada!");
            System.out.println("Número da Conta Poupança "+this.numConta);
            System.out.println("Aqui está seu saldo bonus: "+this.saldo);
        }
    }
    public void fecharConta(){
        Scanner nome = new Scanner(System.in);
        String nomeF;
        System.out.println("Com o Banco EX seu processo de cancelamento é rápido!");
        System.out.println("Por favor informe seu nome completo: ");
        nomeF=nome.nextLine();
        if(nomeF.equalsIgnoreCase(this.cliente)&&this.saldo==0){
            setStatus(false);
            System.out.println("O cliente "+this.cliente+"encerra sua conta de número: "+this.numConta);
            System.out.println("O Banco EX agradece a sua paciência");
        }else if(nomeF.equalsIgnoreCase(this.cliente)&&this.saldo!=0){
            System.out.println("Tentativa de cancelamento não pôde ser concluída pois seu saldo é: "+this.saldo);
            System.out.println("Esvazie seu saldo para efetuar cancelamento");
        }else{
            System.out.println("Cliente não encontrado, por favor reviso os dados");
        }   
    }
    public void sacar(){
        Scanner sacar = new Scanner(System.in);
        float s = 0;
        if(status == true && saldo>0){
            System.out.println("Seu saldo atual é "+saldo);
            System.out.println("Quando deseja sacar: ");
            s = sacar.nextFloat();
            if(s>saldo){
                System.out.println("Seu saldo atual é "+saldo);
                System.out.println("O saldo é insuficiente para o saque de "+s);
            }else{
            saldo -= s;
            System.out.println("O saque no valor de "+s+"foi efetuado");
            System.out.println("Saldo atual "+saldo);
            }
        }else if(status == false){
            System.out.println("Você não tem conta em nosso banco!");
        }else if(status == true && saldo == 0){
            System.out.println("Seu saldo é insuficiente");
            System.out.println("Saldo atual: "+saldo);
        } 
    }
    public void depositar(){
        if(status == true){
            Scanner deposito = new Scanner(System.in);
            float d;
            System.out.println("Seu saldo atual é de: "+saldo);
            System.out.println("Digite o valor do seu depósito:");
            d = deposito.nextFloat();
            saldo +=d;
            System.out.println("O depósito no valor de "+d+"foi efetuado");
            System.out.println("Seu atual é: "+saldo);
        }else if(status == false){
            System.out.println("Infelizmente você ainda não tem conta no nosso banco");
        }
        
    }
    //Métodos especias 

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public boolean getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(boolean tipoConta) {
        this.tipoConta = tipoConta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
