package cn.edu.uzz.mapper;

import cn.edu.uzz.pojo.ProductInfo;
import cn.edu.uzz.pojo.ProductInfoExample;
import cn.edu.uzz.pojo.vo.ProductInfoVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductInfoMapper {
    int countByExample(ProductInfoExample example);

    int deleteByExample(ProductInfoExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(ProductInfo record);

    int insertSelective(ProductInfo record);

    List<ProductInfo> selectByExample(ProductInfoExample example);

    ProductInfo selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByExample(@Param("record") ProductInfo record, @Param("example") ProductInfoExample example);

    int updateByPrimaryKeySelective(ProductInfo record);

    int updateByPrimaryKey(ProductInfo record);

    /**
     * 批量删除
     *
     * @param ids 多个id同时删除
     * @return int 受影响的行数
     */
    int deleteBatch(String[] ids);

    /**
     * 多条件查询
     * @param vo 多条件查询封装对象
     * @return
     */
    List<ProductInfo> selectCondition(ProductInfoVo vo);
}