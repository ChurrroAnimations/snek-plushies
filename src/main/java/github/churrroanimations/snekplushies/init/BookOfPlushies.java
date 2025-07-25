package github.churrroanimations.snekplushies.init;


import net.minecraft.item.ItemStack;
import net.minecraft.item.WrittenBookItem;
import net.minecraft.nbt.NbtList;
import net.minecraft.nbt.NbtString;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class BookOfPlushies extends WrittenBookItem {
    public BookOfPlushies(Settings settings) {
        super(settings);
    }


    // give @a snekplushies:book_of_plushies[written_book_content={pages:['[["The Book of Plushies\\n🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍🐍\\n  This is ",{"text":"T","color":"dark_red"},{"text":"h","color":"gold"},{"text":"e","color":"yellow"}," ",{"text":"B","color":"dark_green"},{"text":"o","color":"dark_blue"},{"text":"o","color":"dark_purple"},{"text":"k","color":"dark_red"}," ",{"text":"o","color":"gold"},{"text":"f","color":"yellow"}," ",{"text":"P","color":"dark_green"},{"text":"l","color":"dark_blue"},{"text":"u","color":"dark_purple"},{"text":"s","color":"dark_red"},{"text":"h","color":"gold"},{"text":"i","color":"yellow"},{"text":"e","color":"dark_purple"},{"text":"s","color":"dark_blue"},{"text":",","color":"black"},{"text":" ","color":"dark_blue"},"which keeps track of the plushies (and blocks OwO) you\'ve found.\\n\\nMade by Churro the turtle plushie\\n• ",{"text":"Snek Plushies Github Page","clickEvent":{"action":"run_command","value":"https://github.com/ChurrroAnimations/snek-plushies"},"hoverEvent":{"action":"show_text","contents":"Github Page"},"color":"blue"},"\\n• ",{"text":"The Lazy Snakes Den","clickEvent":{"action":"open_url","value":"https://disboard.org/server/940020861518360647"},"hoverEvent":{"action":"show_text","contents":"The Lazy Snakes Den on Disboard"},"color":"blue"}]]','[["• Churro\\n• ",{"text":"a","obfuscated":true},"\\n "]]'],title:"The Book of Plushies",author:"Churro the turtle plushie",generation:3}]

    /*    @Override
    public void onCraft(ItemStack stack, World world) {
        NbtList plushiePages = new NbtList();

        super.onCraft(stack, world);
    }*/

    // on craft, in inventory and on use
}
