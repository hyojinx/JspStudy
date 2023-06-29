package utils;

public class pagingUtil {
//	public static String pagingBlock(int totalCount,int pageSize,int blockSize,
//			int pageNum,String reqUri) {
//		String pagingRes="";
//		
//		int totalPage=(int)Math.ceil((double)totalCount/pageSize);
//		
//		int pageTemp=(((pageNum-1)/blockSize)*blockSize)+1;
//		// [first] [prev block] 3 4 5 6 7 [next block] [last]
//		if(pageTemp!=1) {
//			pagingRes ="<a href='"+reqUri+"?pageNum=1'>[first]</a>";
//			pagingRes += "&nbsp;";
//			//pagingRes +="<a href='"+reqUri+"?pageNum="+(pageTemp-1)+"'>[prev block]</a>";
//		}
//		int blockCount=1;
//		while(blockCount<=blockSize && pageTemp<=totalPage) {
//			if(pageTemp==pageNum) {
//				pagingRes+="&nbsp;"+pageTemp+"&nbsp;";
//			}
//			else {
//				pagingRes+="&nbsp;<a href='"+reqUri+"?pageNum="+pageTemp+"'>"
//						+pageTemp+"</a>&nbsp;";
//			}
//			pageTemp++;
//			blockCount++;
//		}	
//		if(pageTemp<=totalPage) {
//			//pagingRes+="<a href = '"+reqUri+"?pageNum="+pageTemp+"'>[next block]</a>";
//			pagingRes+="&nbsp;";
//			pagingRes+="<a href='"+reqUri+"?pageNum="+totalPage+"'>[last]</a>";
//		}
//		
//		return pagingRes;
//	}
//	public static String pagingBlock(int totalCount, int pageSize, int blockSize, int pageNum, String reqUri) {
//        String pagingRes = "";
//
//        int totalPage = (int)Math.ceil((double)totalCount/pageSize);
//
//        // [first] 1 2 3 4 5 [last]
//        int startPage = Math.max(pageNum - blockSize / 2, 1);
//        int endPage = Math.min(startPage + blockSize - 1, totalPage);
//
//        if(startPage != 1) {
//            pagingRes = "<a href='" + reqUri + "?pageNum=1'>[first]</a>";
//            pagingRes += "&nbsp;";
//        }
//
//        for(int i = startPage; i <= endPage; i++) {
//            if(i == pageNum) {
//                pagingRes += "&nbsp;" + i + "&nbsp;";
//            } else {
//                pagingRes += "&nbsp;<a href='" + reqUri + "?pageNum=" + i + "'>" + i + "</a>&nbsp;";
//            }
//        }
//
//       if(endPage != totalPage) {
//            pagingRes += "&nbsp;";
//            pagingRes += "<a href='" + reqUri + "?pageNum=" + totalPage + "'>[last]</a>";
//        }
//
//        return pagingRes;
//    }
public static String pagingBlock(int totalCount,int pageSize,int blockSize,
	int pageNum,String reqUri) {
String pagingRes="";

int totalPage=(int)Math.ceil((double)totalCount/pageSize);
int div=blockSize/2;
int pageTemp = pageNum-div;
int lastPoint=totalPage-(blockSize-1);
if(pageTemp<=0) {
	pageTemp=1;
}else if(pageTemp>=lastPoint)pageTemp=lastPoint;
if(pageTemp!=1) {
	pagingRes ="<a href='"+reqUri+"?pageNum=1'>[first]</a>";
	//pagingRes +="<a href='"+reqUri+"?pageNum="+(pageTemp-1)+"'>[prev block]</a>";
}
int blockCount=1;
while(blockCount<=blockSize && pageTemp<=totalPage) {
	if(pageTemp==pageNum) {
		pagingRes+="&nbsp;"+pageTemp+"&nbsp;";
	}
	else {
		pagingRes+="&nbsp;<a href='"+reqUri+"?pageNum="+pageTemp+"'>"
				+pageTemp+"</a>&nbsp;";
	}
	pageTemp++;
	blockCount++;
}	
if(pageTemp<=totalPage) {
	//pagingRes+="<a href = '"+reqUri+"?pageNum="+pageTemp+"'>[next block]</a>";
	pagingRes+="<a href='"+reqUri+"?pageNum="+totalPage+"'>[last]</a>";
}

return pagingRes;
}
}
