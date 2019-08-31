package com.lishan;
/**
 *功能描述
 * @author wangxu
 * @date 2019/8/25
 */
@FunctionalInterface
public interface Person {
	 /** 
     *  
     * @api {get} /company/list 获取公司信息 
     * @apiName 获取公司列表 
     * @apiGroup All 
     * @apiVersion 0.1.0 
     * @apiDescription 接口详细描述 
     *  
     * @apiParam {int} pageNum分页大小  
     *  
     * @apiSuccess {String} code 结果码 
     * @apiSuccess {String} msg 消息说明 
     * @apiSuccess {Object} data 分页数据封装 
     * @apiSuccess {int} data.count 总记录数 
     * @apiSuccess {Object[]} data.list 分页数据对象数组 
     * @apiSuccessExample Success-Response: 
     *  HTTP/1.1 200 OK 
     * { 
     * code:0, 
     * msg:'success', 
     * data:{} 
     *  } 
     *   
     *  @apiError All 对应<code>id</code>的用户没找到 asdfasdf  
     *  @apiErrorExample {json} Error-Response: 
     *  HTTP/1.1 404 Not Found 
     *  { 
     *   code:1, 
     *   msg:'user not found', 
     *   } 
     *    
     * @param param 
     * @return 
     * @throws Exception 
	 * @author
     * @date 
     */  

    public int aaa(int a,int b);
}
