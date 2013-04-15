/**
 * Author: Assaf Israel, 2013
 * 
 * Computer Science Department,
 * Technion Institute of Technology 
 */
package il.ac.technion.runner;

import java.io.File;
import java.util.List;
import java.util.logging.Logger;

/**
 *  This class is used as a hook for us (the course staff) to run your code using <b>your</b> API.
 *  There are a few <code>public</code> methods in this class which you need to implement.
 *  They correspond to each of the assignment tasks you were asked to implement. 
 *  More details can be found on each of the methods Javadoc.
 *  You are welcome to add <code>private</code> methods, as well as members to this class. 
 *  <b>However, you are not allowed to change the public methods signature and/or the argumentless C'tor</b>  
 */
public class Runner {
	
	private static Logger logger = Logger.getLogger(Runner.class.getCanonicalName()); 
	
	/**
	 * This method build/update a <b>persistent</b> index with data taken from the <code>twitterFeed</code>. 
	 * @param twitterFeed Every tweet in this file is given in a 3-line format:<br/>
	 * 
	 * This action is bounded by 2ms per tweet, which is quite a long time for processing. (~20 minutes for 1mil tweets)   
	 * @throws Exception Is thrown in case of I/O errors or any other errors you feel you can't recover from. 
	 *  You should include a meaningful error message in the exception.
	 */
	public void buildIndex(File twitterFeed) throws Exception {
		logger.info("Updating TKC index with data from "+twitterFeed.getName());
		//TODO Implement buildIndex
	}
	
	/**
	 * Setup is invoked every time TKC is initialized. 
	 * You can use it to initialize components, but you should note that this action needs to comply with strict time constraints.
	 * The method must return within 3 second, for <b>any</b> index size.  
	 * @throws Exception Is thrown in case of I/O errors or any other errors you feel you can't recover from. 
	 *  You should include a meaningful error message in the exception.
	 */
	public void setup() throws Exception {
		logger.info("TKC setup initialized");
		//TODO Implement setup
	}
	
	/** Returns a list of <code>k</code> words, ordered by descending frequency. 
	 *  A word, is any sequence of non-whitespace characters. 
	 *  For example: "So", "much_fun!","@Software", "#Design", "http://tinyurl.com/dx528mt"  
	 * @param k The size of the returned list. 
	 * @throws Exception Is thrown in case of I/O errors or any other errors you feel you can't recover from. 
	 *  You should include a meaningful error message in the exception.
	 * @return A list of <code>k</code> words, starting from the most frequent word.
	 */
	public List<String> topKTrends(int k) throws Exception {
		logger.info("Retreiving top "+k+" twitter trends");
		//TODO Implement topKTrends
		return null;
	}
}
