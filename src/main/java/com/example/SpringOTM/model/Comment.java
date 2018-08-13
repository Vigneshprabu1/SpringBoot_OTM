package com.example.SpringOTM.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comments")
public class Comment extends AuditModel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Lob
    private String text;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;

	public void setPost(Post post2) {
		// TODO Auto-generated method stub
		
	}

	public Object getText() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setText(Object text2) {
		// TODO Auto-generated method stub
		
	}

    // Getters and Setters (Omitted for brevity)
    
}

