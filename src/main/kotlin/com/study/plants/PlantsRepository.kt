package com.study.plants

import com.study.plants.model.Plant
import org.springframework.stereotype.Component

@Component("PlantsRepository")
class PlantsRepository {
    private var plants: List<Plant>;

    init {
        plants = loadPlantList()
    }

    fun getPlants(): List<Plant> = plants

    private fun loadPlantList(): List<Plant> {
        return listOf(
            Plant(
                "001",
                "Succulents",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/44396406-095-b-1635270433.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "Succulents only require a small amount of water, so this set of four succulents from Urban Outfitters is sure to spruce up your home, all the while not requiring much maintenance.",
                "20",
                "Easy"
            ),

            Plant(
                "002",
                "ZZ Plant",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/concept-of-home-gardening-zamioculcas-in-flowerpot-royalty-free-image-1580854121.jpg?crop=0.833xw:0.833xh;0.107xw,0.167xh&resize=980:*",
                "ZZ plants require less water than a lot of plants, so if you tend to neglect yours (rather than overwater them) you'll do well with this one. It'll thrive in bright, indirect light—but it can also tolerate low light if you have a less-than-sunny spot you want to keep it in, according to Bloomscape",
                "24",
                "Easy"
            ),

            Plant(
                "003",
                "Juniper Bonsai",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/bonsai-1635270151.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This Juniper bonsai tree from 1800flowers.com is easy to take care of and will make for the perfect accessory in a minimalist space.",
                "31.49",
                "Easy"
            ),

            Plant(
                "004",
                "Rubber Plants",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/corner-of-a-stylish-living-room-royalty-free-image-638859268-1553272443.jpg?crop=0.947xw:0.949xh;0.0527xw,0.0511xh&resize=980:*",
                "Like most of the other plants on this list, the rubber plant requires bright, indirect light. You should only water it when the soil is dry. Rubber plants have the added benefit of being one of the best natural air-cleaners out there. Place them near your favorite seating area to enjoy fresh air.",
                "21",
                "Intermediate"
            ),

            Plant(
                "005",
                "String of Pearls",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/tender-and-unusual-string-of-pearls-weirdest-royalty-free-image-869615030-1553272264.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "You'll quickly have lengthy strands of pearls by leaving this plant in bright, indirect light with enough water to keep the soil steadily moist. Put yours in a hanging pot that allows the succulent's vines to cascade over the sides.",
                "15.99",
                "Easy to Intermediate"
            ),

            Plant(
                "006",
                "Pilea",
                "https://hips.hearstapps.com/hbu.h-cdn.co/assets/17/27/1499286008-chinese-money-plant.jpg?crop=1.0xw:1xh;center,top&resize=980:*",
                "Bright, indirect sun is the best for this plant, but be careful with watering: It requires a drench-and-dry approach (water thoroughly, then let the soil dry out), along with weekly misting. The unusual round leaves make a dramatic impression, so it's best to keep the pot simple, like this display from The Joy of Plants.",
                "12",
                "Intermediate"
            ),

            Plant(
                "007",
                "Fiddle-Leaf Fig",
                "https://hips.hearstapps.com/hbu.h-cdn.co/assets/15/30/1437670199-fiddle-leaf-fig.jpg?crop=1.0xw:1xh;center,top&resize=980:*",
                "Bright, indirect light is ideal. Only water this plant when the top inch of the soil is dry. Place it in a corner to create a dramatic focal point, like in this apartment over at Design*Sponge.",
                "26.54",
                "Easy"
            ),

            Plant(
                "008",
                "Sweetheart Plant",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/top-view-of-sweetheart-plant-royalty-free-image-1580854557.jpg?crop=0.445xw:0.997xh;0.484xw,0&resize=980:*",
                "This adorable little heart-shaped plant, also known as Hoya kerrii, can be sold as either a single leaf-cutting or a whole trailing plant. It's a succulent that needs very little care (according to The Sill, watering it every three to four weeks is ideal), and it does best in bright, direct light. Consider it a perfect little addition to your window sill.",
                "26",
                "Easy"
            ),

            Plant(
                "009",
                "Anthurium",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/pink-anthurium-flower-royalty-free-image-898519468-1553277047.jpg?crop=1xw:0.99953xh;center,top&resize=980:*",
                "Known for its waxy, heart-shaped flowers with a prominent stamen in the center, this plant needs to be watered every one to two weeks and requires occasional fertilizing—so they're not low-maintenance, but not high-maintenance, either.",
                "30",
                "Intermediate"
            ),

            Plant(
                "010",
                "Bird of Paradise",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/bright-living-room-with-a-large-house-plant-copy-royalty-free-image-1580854667.jpg?crop=0.479xw:0.998xh;0.0241xw,0&resize=980:*",
                "Let this plant grow in a bright, sunny spot and it will definitely prosper, but it can handle lower light levels, too. You'll need to fertilize it often in the spring and summer according to Bloomscape, but otherwise it's fairly simple to handle—so long as you don't overwater it.",
                "46.76",
                "Intermediate"
            ),

            Plant(
                "011",
                "Snake Plant",
                "https://hips.hearstapps.com/hbu.h-cdn.co/assets/15/30/1437667747-snake-plant.jpg?crop=0.9277777777777777xw:1xh;center,top&resize=980:*",
                "Indirect light is ideal for these plants (also called Mother-in-Law's Tongue), along with light waterings that take place only after the soil has fully dried. Place it in an elevated planter to add interest to an empty corner in your hall, as seen here at A House in the Hills.",
                "27",
                "Easy"
            ),

            Plant(
                "012",
                "Begonia",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/rex-cultorum-type-of-begonia-with-large-high-res-stock-photography-55857155-1553275756.jpg?crop=0.672xw:1.00xh;0.218xw,0&resize=980:*",
                "Like the aloe and the kalanchoe plants, begonias need their soil to dry out completely between waterings. Oddly enough, this plant responds well even to fluorescent light, which makes it a perfect one for the office.",
                "15",
                "Easy"
            ),

            Plant(
                "013",
                "Kalanchoe",
                "https://hips.hearstapps.com/hbu.h-cdn.co/assets/15/25/1434398047-gettyimages-150096970.jpg?crop=0.9997644287396938xw:1xh;center,top&resize=980:*",
                "Kalanchoe makes for a marvelous mood booster in the kitchen. Low humidity is a friend of this plant, which will bloom even in the wintertime. Water thoroughly, then leave it until the soil dries out.",
                "19",
                "Easy"
            ),

            Plant(
                "014",
                "Air Plant",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/tillandsia-air-plant-royalty-free-image-931339332-1553272896.jpg?crop=0.889xw:1.00xh;0.111xw,0&resize=980:*",
                "Though these plants grow anywhere (but bright, indirect light is best), you need to soak them in water once a week for at least 10 minutes. They're the perfect addition to any terrarium. There are tons of different types of air plants, too, which is great if you like your plants to have variety.",
                "5",
                "Intermediate"
            ),

            Plant(
                "015",
                "Peace Lily",
                "https://hips.hearstapps.com/hbu.h-cdn.co/assets/17/27/1499282280-peace-lily.jpg?crop=1.0xw:1xh;center,top&resize=980:*",
                "This plant requires medium to low light and only needs to be watered when the top of the soil is dry. Juxtapose the organic shape of the leaves with a modern planter like this DIY option from Pretty Nice.",
                "20",
                "Easy"
            ),

            Plant(
                "016",
                "Split Leaf Philodendron",
                "https://hips.hearstapps.com/hbu.h-cdn.co/assets/15/30/1437674751-split-leaf-philodendron.jpg?crop=0.953xw:1.00xh;0.0466xw,0&resize=980:*",
                "Bright, indirect light and even moisture allow this plant to thrive. The Brick House dipped a simple planter in neon paint, which brings out the gorgeous green color of its leaves.",
                "32",
                "Easy"
            ),

            Plant(
                "017",
                "Asparagus Fern",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/beautiful-asparagus-fern-plant-in-a-basket-royalty-free-image-972247932-1553271995.jpg?crop=0.779xw:0.771xh;0.221xw,0.229xh&resize=980:*",
                "Indirect light is best and you should also give them plenty of water, being careful not to over-saturate the soil. Hang the pot from a modern macrame holder or plant it in a woven basket for a boho feel.",
                "14",
                "Easy"
            ),

            Plant(
                "018",
                "Jade Plant",
                "https://hips.hearstapps.com/hbu.h-cdn.co/assets/17/27/1499285282-jade-plant.jpg?crop=1.0xw:1xh;center,top&resize=980:*",
                "These plants only require medium light for a few hours every day and waterings every few days after the soil has completely dried. To help the deep green leaves with red tips on this plant pop, put it in a pot that's just as vibrant and striking.",
                "15",
                "Easy"
            ),

            Plant(
                "019",
                "Aloe Plant",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/close-up-of-aloe-vera-plant-against-wall-royalty-free-image-746098999-1553269788.jpg?crop=1xw:0.99953xh;center,top&resize=980:*",
                "Aloe loves the sun and only requires water once a week, allowing the soil to dry completely in between. Put your plant in a tall pot that keeps the leaves off the table. If you're feeling extra creative, paint a rounded pot to resemble a pineapple before adding the aloe, the way they do in Lines Across.",
                "21",
                "Easy"
            ),

            Plant(
                "020",
                "Dragon Tree",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/dragon-tree-1515440694.jpg?crop=0.760xw:0.915xh;0.187xw,0&resize=980:*",
                "Spiky leaves that grow upwards and have a red outline make the name of this plant absolutely perfect. But direct sunlight could damage them—so give this guy a mix of sun and shade. The statement-making leaves pair perfectly with a modern pot.",
                "22",
                "Intermediate"
            ),

            Plant(
                "021",
                "Spider Plant",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/spider-plant-on-wooden-stand-royalty-free-image-1026156198-1553271665.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "Bright, indirect light and occasional waterings make the spider plant one of the easiest to care for. Show off its curved leaves with a hanging planter for even more drama.",
                "18",
                "Easy"
            ),

            Plant(
                "022",
                "Gardenia",
                "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/blooming-gardenia-jasmine-royalty-free-image-909875410-1553276646.jpg?crop=0.879xw:0.881xh;0.121xw,0.119xh&resize=980:*",
                "There's nothing quite like the intoxicating scent of gardenia flowers, but special attention is required to get blooms to appear. It needs six to eight hours of bright, direct sunlight (and growing lights won't do)—but what a lovely choice for a foyer!",
                "54",
                "Expert"
            ),

            Plant(
                "023",
                "INCH POT",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1610733391-il_794xN.2480917409_qe1e.jpg?crop=1xw:0.967xh;center,top&resize=980:*",
                "Like all philodendrons, you have to be careful to not overwater it,” says Carter. “Only give it a drink when the soil is completely dry. When it comes to light, it likes it bright or medium and indirect.",
                "24",
                "Easy"
            ),

            Plant(
                "024",
                "BURGUNDY RUBBER TREE",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1589560889-bloomscape_product-burgundy-rubber-tree-clay-1.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This is one of my favorite ficus trees,” says Carter. “It’s less finicky than its popular cousin, the fiddle-leaf fig, and it can grow up to 25 feet indoors. When it comes to light, it does well when it’s bright and indirect. Keep the soil moist during the growing season, which is summer. In the winter, the soil needs less moisture.",
                "150",
                "Intermediate"
            ),

            Plant(
                "025",
                "PILEA PEPEROMIOIDES",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1589561181-Monet_SolidCarousel.jpg?crop=0.870xw:0.906xh;0.0353xw,0.0762xh&resize=980:*",
                "This is a widely loved plant with many endearing nicknames like UFO plant, pancake plant, and Chinese money plant,” says Carter. “Its love of humidity makes it a great way to add color to a bathroom. The sprouted leafy discs could also work in any space with bright indirect light. Let the soil dry out between waterings to avoid root rot. Their leaves will droop a bit when they are thirsty.",
                "90",
                "Expert"
            ),

            Plant(
                "026",
                "JADE",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1589562470-jade-plant-1589562420.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This is one of my favorite succulents to grow indoors. Unlike other plants, it can survive a day of direct sunlight,” says Carter. “Place it in a pot with a drainage hole and water every two weeks only when the top two inches of soil are dry. To keep it looking fresh, just give dying or dry branches a snip.",
                "21",
                "Easy"
            ),

            Plant(
                "027",
                "VARIEGATED ARROWHEAD VINE",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1589575893-arrowhead-plant-1589575872.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "Just like other variegated plants, the beauty exists in its tricolor foliage,” says Carter. “It will need its soil to stay evenly moist, so you’ll have to water it more frequently during spring and summer. Don’t ever let the soil completely dry out. It thrives in humidity, so a weekly misting session would be beneficial. Like most houseplants, it likes bright indirect light but can also tolerate low light.",
                "15",
                "Easy"
            ),

            Plant(
                "028",
                "HOYA CARNOSA VARIEGATA",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1589562749-hoya-carnosa-variegata-1589562729.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This waxy-leafed beauty will do best in an area of your home that gets bright indirect light,” says Carter. “Direct sunlight will kill the plant over time. Only water it when the soil is dry, but do spray it with mist weekly because their leaves love humidity.",
                "16",
                "Easy"
            ),

            Plant(
                "029",
                "LIPSTICK PLANT",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623876640-il_794xN.2692622350_h6wb.jpg?crop=1.00xw:0.811xh;0,0.189xh&resize=980:*",
                "It’s easy to see where this got its name,” says Carter. “It thrives in bright indirect light but will also do well in filtered light. Be careful not to overexpose it to direct sun, because this can burn the leaves and dry the plant out. Keep the soil moist, not wet. For balanced growth, rotate it at least once a month.",
                "16",
                "Intermediate"
            ),

            Plant(
                "030",
                "HOYA",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623876728-il_794xN.2787836394_poib.jpg?crop=0.948xw:0.733xh;0,0.158xh&resize=980:*",
                "Also known as the Crimson Prince, like other hoyas, this trailing beauty is perfect for displaying in a window that gets bright but indirect light,” says Carter. “They love humidity, so try misting it once a week and let the soil dry between waterings. Repot during the spring or summer when the roots start peeking out of the drainage hole.",
                "13",
                "Easy"
            ),

            Plant(
                "031",
                "ARALIA FABIAN",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623876909-il_794xN.2998753617_a2ds.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "The Aralia Fabian reminds me of something out of a Dr. Seuss book. Its beauty and weirdness comes from its thick burly trunk, thin speckled branches, and pancake-shaped foliage that’s a dark shade of green on top and a shade of violet on the bottom,” says Carter. “To care for it, place your plant in a pot that has a drainage hole and water it until water comes out in the base tray. Repeat only when the top two inches of soil become completely dry. It can live in a nice spot that has bright indirect light. If you don’t have that, a mix of dappled light throughout the day will also work well.",
                "45",
                "Intermediate"
            ),

            Plant(
                "032",
                "FICUS ALII",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623877082-il_794xN.3187067513_1tcj.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This is a statement plant,” says Carter. “The beautiful long green foliage makes it stand out from other ficus trees. Plus, it’s more durable and less prone to dropping its leaves. It needs plenty of indirect sunlight and will not survive in low light. Keep the soil consistently moist and only let the top inch dry before watering.",
                "150",
                "Expert"
            ),

            Plant(
                "033",
                "MONSTERA DELICIOSA",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623877454-costa-farms-house-plants-10philomonsea-64_1000.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "With its thick, Swiss cheese–like leaves and tropical feel, the Monstera deliciosa is a perfectly bold plant that can truly thrive in an apartment. They can tolerate many levels of sunlight and even grow under fluorescent lights. While you should water your Monstera regularly, it can survive a missed watering every now and then.",
                "75",
                "Expert"
            ),

            Plant(
                "034",
                "RED PRAYER PLANT",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623877642-51hOmX8rdiL._SL500_.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "Striking red veins against soft, dark green leaves make the Red Prayer plant an aesthete’s dream, and its low upkeep makes it perfect for apartment dwellers. It should be kept in low to bright indirect sunlight, watered regularly, and misted once a week, but it can tolerate low light every now and then.",
                "19",
                "Easy"
            ),

            Plant(
                "035",
                "ZEBRA PLANT",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623877745-il_794xN.2475192509_12kk.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "The Haworthia, or zebra plant, is one of the easiest succulents to grow. Maxing out at only eight inches tall, they require low light and minimal watering. Haworthia can be placed in both open spaces like a living room or small, contained spaces like a bathroom. Plus, their striped leaves are subtly striking—the perfect complement to any design style.",
                "10",
                "Easy"
            ),

            Plant(
                "036",
                "BIRD’S NEST FERN",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623877917-birdnestfern-1623877886.png?crop=1xw:1xh;center,top&resize=980:*",
                "Perfect for bathrooms or confined spaces, the bird’s nest fern can be hung or potted, making it a versatile option that can move around your apartment at ease. The large leaves and glossy finish are similar to a standard fern, and it can thrive in a low-light space.",
                "49",
                "Intermediate"
            ),

            Plant(
                "037",
                "HAPPY BEAN PLANT",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623877966-succulents-401675-64_1000.jpg?crop=0.822xw:0.830xh;0.0753xw,0.103xh&resize=980:*",
                "If the name isn’t enticing enough on its own, there are plenty of reasons to love the happy bean plant. For one, it boasts thick, succulent leaves that look just like green beans, and it only grows about 10 inches tall. Bright but not direct sunlight is recommended, and it only needs to be watered sparingly.",
                "25",
                "Easy"
            ),

            Plant(
                "038",
                "FICUS BONSAI TREE",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623878004-51bbPjZs1ML._SL500_.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "Bonsai is the Japanese art of pruning in which small trees mimic the scale and shape of a full-size tree. Bonsais are perfect for apartments because of their size, and the ficus bonsai is one of the lowest-maintenance ones. The ficus bonsai thrives in warm environments, so indoors is ideal. They require high sunlight and can survive occasional over- or underwatering.",
                "28",
                "Easy"
            ),

            Plant(
                "039",
                "POTHOS",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623878102-the-sill_pothos-marble-queen_variant_small_hyde_black_1440x.jpg?crop=1.00xw:0.781xh;0,0.219xh&resize=980:*",
                "The pothos plant can be hung from a basket or potted normally, and it will thrive in a wide variety of lighting conditions. It’s also known for its air-purification properties and can strip your home of toxins that can off-gas from furniture and rugs.",
                "40",
                "Intermediate"
            ),

            Plant(
                "040",
                "CAST IRON PLANT",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623878136-41u8JNJ47QL._SL500_.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "The cast-iron plant can survive in low light, in poor soil, and with minimal water, making it one of the most durable indoor plants. The deep green leaves also provide a stunning pop of color in your home.",
                "25",
                "Intermediate"
            ),

            Plant(
                "041",
                "FIDDLE-LEAF FIG",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623878212-small-plant-fiddle-leaf-fig-white-pot_2048x.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "The fiddle-leaf fig is great for apartments with high ceilings but minimal floor space. The plant is tall but not bushy and boasts waxy, dark green leaves. It requires medium light and only needs to be watered when the soil is dry to the touch.",
                "48",
                "Intermediate"
            ),

            Plant(
                "042",
                "PRICKLY PEAR CACTUS",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623878318-pricklypear-1623878298.png?crop=1xw:1xh;center,top&resize=980:*",
                "Funky and unfussy, cacti are probably the poster plants for non-garden environments. They only require watering once a week while growing, and during cooler weather, you can get away with watering every few weeks to a month. Place it in a sunny area but keep out of direct sunlight, which can make the cactus look bleached or even orange. Cacti—like the prickly pear here— have an irresistibly unique aesthetic that blends with a range of apartment styles, from bohemian to modern.",
                "69",
                "Intermediate"
            ),

            Plant(
                "043",
                "LUCKY BAMBOO",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623878596-41l5B96oOpL._SL500_.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "If you want to add greenery to the darker parts of your apartment, lucky bamboo is your ideal plant. It thrives in dim, indirect sunlight and can add a major sense Zen to your space— quite helpful for apartments in busy cities. Grow lucky bamboo in water, changing it every week.",
                "12",
                "Easy"
            ),

            Plant(
                "044",
                "WEEPING FIG",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623955006-brighter-blooms-house-plants-fic-ben-23-3-brd-64_600.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "It may be a weeping fig, but it could be a green vignette of joy in your apartment. These little trees can add the necessary amount of green we all need for a small space, and they only require watering every four to seven days. Place in a window that gets bright, indirect sunlight, turning the plant every once in a while to avoid excess growth on one side.",
                "90",
                "Expert"
            ),

            Plant(
                "045",
                "ALOE VERA",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1619452806-31I2HHUKTXL._SL500_.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "With indoor aloe vera, you’ll have instant medication on hand for scrapes and burns, plus a funky, spiky decor item for your kitchen or living room. Keep it near a window and water regularly, allowing the top two inches of soil to dry between waterings (which also means you can go on vacation and not come home to droopy aloe).",
                "17",
                "Easy"
            ),

            Plant(
                "046",
                "PADDLE PLANT",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623955150-411QzyrziL._SL500_.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "The paddle plant is a succulent with a unique shape and unfussy care requirements. Like other succulents, it grows best when exposed to bright light and even some direct light (the more it’s exposed to sun, the more its leaves will turn red). This plant does well in indoor environments, withstanding dry air even when you crank up the heat in your apartment during the winter months. Allow the top two inches of dirt to dry between waterings.",
                "15",
                "Easy"
            ),

            Plant(
                "047",
                "PHILODENDRON",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1621441510-51U8v56iDKL._SL500_.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This is a staple interior plant that is great for apartment dwellers because it’ll tell you exactly what it wants. For example, is it turning yellow? That means it’s getting too much sunlight. Is it growing small leaves? That means it wants more fertilizer, so feed it a liquid houseplant fertilizer with macronutrients. For a happy plant, allow one inch of soil to dry (about the length from your index finger to your first knuckle) between waterings.",
                "16",
                "Easy"
            ),

            Plant(
                "048",
                "LAVENDER",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623955320-28955.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "It may be an unconventional indoor plant, but a pot of lavender will add a pop of color and freshen your apartment far better (and far more naturally) than an air freshener. Lavender does best in bright light, so place it near a south-facing window that welcomes in plenty of sunshine. Smaller varieties are better for indoors, and they can be placed under a grow light if you don’t have ample sunshine in your apartment.",
                "45",
                "Intermediate"
            ),

            Plant(
                "049",
                "BIRD-OF-PARADISE",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623958506-birdofparadise-bloomscape-1623958481.png?crop=1.00xw:1.00xh;0,0&resize=980:*",
                "Add a tropical touch to your apartment with a verdant bird-of-paradise (Strelitzia nicolai) plant. These plants, native to South Africa and known for their showy flowers, can also thrive indoors, though they’re unlikely to bloom in those conditions. Be sure to give this one ample sunlight, keep the soil moist, and rotate it regularly to keep it growing straight. ",
                "150",
                "Expert"
            ),

            Plant(
                "050",
                "PINK ANTHURIUM",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623958717-the-sill_anthurium-pink_variant_small_bryant_blush_1440x.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This plant (also known as a flamingo or pigtail plant) is an Instagram fave, and it’s easy to see why, with its heart-shaped leaves, waxy, salmon-colored blooms, and sculptural spadix. This plant thrives in damp conditions, so consider placing it in a well-lit bathroom. Keep out of reach of kids, dogs, and cats, however—it is poisonous if ingested. ",
                "68",
                "Intermediate"
            ),

            Plant(
                "051",
                "PONYTAIL PALM",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623958754-il_794xN.3012396308_at5p.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "This frondy plant is as fun as its name. But—contrary to its name—it is in fact a succulent, not a palm. Thankfully, that means it’s relatively low maintenance and prefers semidry conditions; be sure to let this one dry out between waterings every few weeks. It’s also safe for kids and pets. ",
                "31",
                "Intermediate"
            ),

            Plant(
                "052",
                "DIEFFENBACHIA",
                "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1623959191-medium-plant-dieffenbachia-white-pot_2048x.jpg?crop=1xw:1xh;center,top&resize=980:*",
                "The dieffenbachia, a classic houseplant to add to your indoor garden, features large, mottled leaves. Like so many plants, however, this one can fall victim to overwatering. But with well-draining soil and filtered light, it will be good to grow. ",
                "83",
                "Intermediate"
            )
        )
    }
}