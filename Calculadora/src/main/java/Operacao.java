public enum Operacao implements Calcular {
    SOMA("+"){
        @Override
        public double calcular(double v1, double v2) {
            return v1 + v2;
        }
    },
    SUBTRACAO("-"){
        @Override
        public double calcular(double v1, double v2) {
            return v1-v2;
        }
    },
    MULTIPLICACAO("*"){
        @Override
        public double calcular(double v1, double v2) {
            return v1*v2;
        }
    }
    ,DIVISAO("/"){
        @Override
        public double calcular(double v1, double v2) {
            if(v2!=0){
                return v1 / v2;
            }else{
                throw new IllegalArgumentException("A Divisão por 0 não é possível");
            }
        }
    };
    private final String simbolo;
    Operacao(String simbolo){
        this.simbolo = simbolo;
    }
    public static Operacao peloSimbolo(String simbolo){
        for(Operacao op: values()){
            if (op.simbolo.equals(simbolo)){
                return op;
            }
        }
        throw new IllegalArgumentException("Operador inválido "+ simbolo);
    }

}
