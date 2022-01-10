package org.myjava.dfc;

public class Caculate {
    public static void main(String[] args) {
        double p = 15.2;//当年利润
        double a = 0.3;//第一段增长率
        double b = 0.05;//第二段增长率
        double txl = 0.09;//折现率，要大于无风险收益率，要考虑股权资金成本，借贷成本，取值越大风险越大，通常7%～15%，建议取9%，这也是巴菲特当年的取值
        int y = 3;//第一段年数
        double z = 0 ;//折现总值
        int hb = 0 ;//货币资金(加)
        int cqgqtz = 0 ;//长期股权投资（加）
        int dqjk = 0 ;//短期借款（减）
        int ssgdqy = 0;//少数股东权益（减）
        // 第一段
        for (int i = 1; i < y+1; i++) {
            double xi = p * Math.pow(1 + a,i) ;
            double zxi = xi/Math.pow(1+txl,i) ;
            System.out.println("第"+i+"年现金流："+xi + ",折现后："+zxi);
            z = z + zxi ;
        }
        System.out.println("前"+y+"年折现总额："+z);
        // 第二段
        double zy = 0 ;//折现总值
        double R = (p * Math.pow(1 + a,y)) * (1 + b) ;//第y+1年的现金流
        double zyi = R/(txl-b) ;
        System.out.println("第"+(y+1)+"年现金流："+R + ",永续年金："+zyi );
        double f = zyi/Math.pow(1+txl,y) ;
        System.out.println("永续年金折现："+f);
        zy = z + f ;
        System.out.println("折现总值:"+zy);
    }


    /**
     * 计算永续年金
     * @param R 现金流
     * @param t 贴现率
     * @param b 增长率
     * @return
     */
    public static double yxnj(double R,double t,double b){
      double zyi = R/(t-b) ;
      return zyi ;
    }

    /**
     * 计算折现
     * @param z 待折现价值
     * @param t 贴现率
     * @param y 折现年数
     * @return
     */
    public static double zx(double z,double t,int y){
        double f = z/Math.pow(1+t,y) ;
        return f ;
    }
}
