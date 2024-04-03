import { Button, Image, StyleSheet, Text, View } from "react-native";

const ShoppingCart = ({ route }: any) => {

    // const initialState = {id: "", name: "", price: 0, description: ""}
    
    // const [product, setProduct] = useState(initialState)

    // const { productId } = route.params;

    // useEffect(() => {
    //     getProductById(productId)
    //         .then((product) => setProduct(product))
    // },[])

    return (
        <View style={styles.container}>
            <View style={styles.detailContainer}>
                <Image source={require('./../assets/test.jpg')} style={styles.image}/>
                <Text>SOY UN PRODUCTO DEL CARRITO</Text>
                {/* <Text>{product.price}</Text>
                <Text>{product.description}</Text> */}

                <Button title="Comprar" onPress={() => {}} />
            </View>
            
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        padding: 10,
        height: "100%",
        marginTop: 30
    },
    detailContainer: {
        flexDirection: 'column',
        alignItems: "center",
        backgroundColor: 'white',
        padding: 10,
        borderRadius: 10,
        marginBottom: 10,
        shadowColor: '#000',
        shadowOffset: {
          width: 0,
          height: 2,
        },
        shadowOpacity: 0.25,
        shadowRadius: 3.84,
        elevation: 5,
        width: "100%",
        height: "70%"
    },
    image: {
        width: "100%",
        height: "50%",
        borderRadius: 10,
        marginBottom: 10,
    }
});

export default ShoppingCart;