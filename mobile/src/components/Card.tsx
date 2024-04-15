import { Image, StyleSheet, Text, View } from "react-native";

interface CardProps {
    item: any
}

const Card = ({ item }: CardProps) => {
    return (
        <View style={styles.container}>
            <Image source={require('./../assets/test.jpg')} style={styles.image}/>
            <Text>{item.name}</Text>
            <Text>{item.price}</Text>
            <Text>{item.description}</Text>
        </View>
    )
}

const styles = StyleSheet.create({
    container: {
        flexDirection: 'column',
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
        width: "100%"
    },
    image: {
        width: "100%",
        height: 200,
        borderRadius: 10,
        marginBottom: 10,
    }
});
  
export default Card;