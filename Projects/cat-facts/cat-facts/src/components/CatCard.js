const CatCard = props => {
    const {facts} = props;

    return(
        <div className="card">
            <div className="fact-card">
                <div className="card-text">{facts.text}</div>
            </div>
        </div>
    )
}

export default CatCard;