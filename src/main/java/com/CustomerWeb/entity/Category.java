package com.CustomerWeb.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "category_seq")
    @SequenceGenerator(name = "category_seq", sequenceName = "category_seq", allocationSize = 1)
    private Long id;
    @NotBlank
    @Column(unique = true, nullable = false)
    private String name;

    private String description;
    private boolean active;
    @OneToMany(mappedBy = "category")
    private List<Product> products;

    public Long getId()
    {

        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getDescription()
    {
        return description;
    }
    public void setDescription(String description)
    {
        this.description = description;
    }

    public boolean isActive()
    {
        return active;
    }

    public void setActive(boolean active) {

        this.active = active;
    }
    public List<Product> getProducts()
    {
        return products;
    }
    public void setProducts(List<Product> products)
    {
        this.products = products;

    }
}