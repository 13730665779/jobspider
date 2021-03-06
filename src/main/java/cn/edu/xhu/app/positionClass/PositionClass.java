package cn.edu.xhu.app.positionClass;

import javax.persistence.*;

/**
 * @IDE: Created by IntelliJ IDEA.
 * @Author: 千千寰宇
 * @Date: 2018/9/28  02:02:41
 * @Description: ...
 */

@Entity
@Table(name = "tb_position_class", schema = "job_spider")
public class PositionClass {

    @Id
    @GeneratedValue
    @Column(name = "pk_position_class_id", nullable = false)
    private Integer id;

    @Basic
    @Column(name = "name", nullable = false, length = 255)
    private String name;

    public PositionClass() {
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PositionClass that = (PositionClass) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
