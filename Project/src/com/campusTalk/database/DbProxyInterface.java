package com.campusTalk.database;

import java.util.List;

import com.campusTalk.model.*;

public interface DbProxyInterface {
	
	public void saveForumDetails(Forum forum);
	public List<Forum> getForumResults(String criteria,int userId);
	public void savePostDetails(Post post);
	public List<Post> getPostsInForum(int forumId);
	public void saveReplyDetails(Reply reply);
	public List<Reply> getRepliesToPost(int postId);
	public void saveSubscription(Subscription subscription);
	public void deleteSubscription(int userId, int forumId);
	
	
}