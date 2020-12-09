package com.accp.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.nlpcn.commons.lang.index.MemoryIndex;
import org.nlpcn.commons.lang.pinyin.Pinyin;
import org.springframework.beans.factory.annotation.Autowired;

import com.accp.biz.lzj.MemBerBiz;
import com.accp.dao.MemberMapper;

public class SearcuUtils {
	
	@Autowired
	private MemBerBiz biz;

	// 构造方法私有化
		private SearcuUtils INSTANSE = new SearcuUtils ();
		
		/**|
		 * description: 实现简单文字搜索
		 * @param key  用于搜索的关键词
		 * @param wordList  待搜索的词库
		 * @return List<String>
		 * @version v1.0
		 * @author w
		 * @date 2020年2月29日 下午9:12:54
		 */
		@SuppressWarnings("unchecked")
		public static List<String> search(String key , List<String> wordList){
			MemoryIndex<String> memoryIndex = new MemoryIndex<String>();
	        if (StringUtils.isBlank(key) || CollectionUtils.isEmpty(wordList)) {
	            return Collections.EMPTY_LIST;
	        }
	        for (String word : wordList) {
	        	// 汉字转为完整拼音，如：中国 -- zhongguo
	            String fullChar = StringUtils.join(Pinyin.pinyin(word), "");
	            // 汉字转为拼音缩写，如：中国 -- zg
	            String firstChar = StringUtils.join(Pinyin.firstChar(word), "");
	            memoryIndex.addItem(word, word, fullChar, firstChar);
	        }
	        return memoryIndex.suggest(key);
		} 
		
		/**
		 * description: 加载待搜索的词库 --- 临时用
		 * @param path
		 * @return List<String>
		 * @version v1.0
		 * @author w
		 * @date 2020年2月29日 下午9:15:51
		 */
		public List<String> loadWordList() {
			List<String> list = biz.queryAllNumber();
			//list.add("1");
		/*
		 * list.forEach(temp->{ System.out.println("a "+temp); });
		 */
			return list;
		}
}
