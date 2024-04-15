import { useEffect, useState } from "react";
import { ScrollView, StyleSheet, Text, TouchableOpacity, View } from "react-native";
import { getAllProducts } from "../../services/products";
import Card from "../../components/Card";
import { HomeProps, Product } from "./interfaces";

const Home: React.FC<HomeProps> = ({ navigation }) => {
    const [products, setProducts] = useState<Product[]>([]);

    useEffect(() => {
        getAllProducts()
            .then((products) => setProducts(products))
    }, [])

    return (
        <View style={styles.container}>
            <ScrollView >
                {products.map((product) =>
                    <TouchableOpacity
                        key={product.id}
                        onPress={() => navigation.navigate('Detail', { productId: product.id })}
                    >
                        <Card item={product} />
                    </TouchableOpacity >
                )}
            </ScrollView>
            {/* <Button
                title="Carrito"
                onPress={() => navigation.navigate("ShoppingCart")}
            /> */}
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        width: "100%",
        height: "100%"
    },
    cardsContainer: {
        width: "100%",
        height: "100%",
        flexWrap: "wrap",
    },
    cardContainer: {
        padding: 10,
        height: "50%",
    },
    image: {
        width: "30%",
        height: "30%"
    }
});

export default Home;

