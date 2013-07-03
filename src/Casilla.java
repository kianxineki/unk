import java.util.ArrayList;
import java.util.List;



public class Casilla {
	private int TileID;
	private int tree;
	private boolean blocked = false;
	private float[] vertices = {0,0,0,0};
	private List<Integer> id_obj =new ArrayList<Integer>();
	
	public Casilla(int TileID, float a, float b, float c, float d)
	{
		this.TileID = TileID;
		this.vertices[0] = a;
		this.vertices[1] = b;
		this.vertices[2] = c;
		this.vertices[3] = d;
		
		
	}
	/*TILED*/
	public void up(boolean a, boolean b,boolean c,boolean d)
	{
		if (a == true)
			this.vertices[0] += 0.02f;
		if (b == true)
			this.vertices[1] += 0.02f;
		if (c == true)
			this.vertices[2] += 0.02f;
		if (d == true)
			this.vertices[3] += 0.02f;
	}
	public void down(boolean a, boolean b,boolean c,boolean d)
	{
		if (a == true)
			this.vertices[0] -= 0.02f;
		if (b == true)
			this.vertices[1] -= 0.02f;
		if (c == true)
			this.vertices[2] -= 0.02f;
		if (d == true)
			this.vertices[3] -= 0.02f;
	}
	public void set_Tiled(int TileID)
	{
		this.TileID = TileID;
	}
	public int get_Tiled(){
		return this.TileID;
	}
	/*TILED*/
	
	/*OBJECTS*/
	public void add_Tree(int type)
	{
		this.tree = type;
		set_blocked(true);
	}
	public void remove_Tree()
	{
		this.tree = 0;
	}
	public int get_Tree()
	{
		return this.tree;
	}
	public void add_Objects(int id_obj)
	{
		this.id_obj.add(id_obj);
	}
	public void remove_Objects()
	{
		this.id_obj = null;
	}
	public void set_Objects(List<Integer> id_obj)
	{
		this.id_obj = id_obj;
	}
	public List<Integer> get_Objects()
	{
		//
		return this.id_obj;
	}
	public int get_Objects_check()
	{
		return this.id_obj.size();
	}
	/*OBJECTS*/
	
	/*BLOCKED*/
	public void set_blocked(boolean blocked)
	{
		this.blocked = blocked;
	}
	public boolean get_blocked()
	{
		return this.blocked;
	}
	/*BLOCKED*/
	public float[] get_vertices() {
		return vertices;
	}
	
	 /**
	 * mapa_objetos[1][5] = new Casilla(1,5,"pepe")
	 * 
	 * mapa_objetos[x][y].set_Tiled()
	 * 
	 * mapa_objetos[x][y]
	 * 
	 */
	

}