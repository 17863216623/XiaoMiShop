package cn.edu.uzz.pojo.vo;

/**
 * 多条件查询封装对象
 */
public class ProductInfoVo {
    /**
     * 商品名称
     */
    private String pname;
    /**
     * 商品类型
     */
    private Integer typeid;
    /**
     * 最低价格
     */
    private Double lprice;
    /**
     * 最高价格
     */
    private Double hprice;

    /**
     * 无参构造
     */
    public ProductInfoVo() {
    }

    //    全参构造
    public ProductInfoVo(String pname, Integer typeid, Double lprice, Double hprice) {
        this.pname = pname;
        this.typeid = typeid;
        this.lprice = lprice;
        this.hprice = hprice;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Double getLprice() {
        return lprice;
    }

    public void setLprice(Double lprice) {
        this.lprice = lprice;
    }

    public Double getHprice() {
        return hprice;
    }

    public void setHprice(Double hprice) {
        this.hprice = hprice;
    }

    @Override
    public String toString() {
        return "ProductInfoVo{" +
                "pname='" + pname + '\'' +
                ", typeid=" + typeid +
                ", lprice=" + lprice +
                ", hprice=" + hprice +
                '}';
    }
}
