public class Park
{
    private String name;
    private String location;
    private double area;
    private int visitors;
    private String description;

    public Park()
    {
        name = "unknown";
        location = "unknown";
        area = 0.0;
        visitors = 0;
        description = "unknown";
    }

    public Park(String name, String location, double area, int visitors, String description)
    {
        this.name = name;
        this.location = location;
        this.area = area;
        this.visitors = visitors;
        this.description = description;
    }

    public Park(Park other)
    {
        this.name = other.name;
        this.location = other.location;
        this.area = other.area;
        this.visitors = other.visitors;
        this.description = other.description;
    }

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public double getArea()
    {
        return area;
    }

    public int getVisitors()
    {
        return visitors;
    }

    public String getDescription()
    {
        return description;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public void setVisitors(int visitors)
    {
        this.visitors = visitors;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setAll(String name, String location, double area, int visitors, String description)
    {
        this.name = name;
        this.location = location;
        this.area = area;
        this.visitors = visitors;
        this.description = description;
    }

    public boolean equals(Object obj)
    {
        Park park;
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        park = (Park) obj;
        return Double.compare(park.area, area) == 0 &&
                visitors == park.visitors &&
                name.equals(park.name) &&
                location.equals(park.location) &&
                description.equals(park.description);
    }

    public String toString()
    {
        return String.format("name: %s%nlocation: %s%narea: %,.2f%nvisitors: %,d%ndescription: %s", name, location, area, visitors, description);
    }
}
