.class public final synthetic Lcom/join/mgps/adapter/i4;
.super Ljava/lang/Object;

# interfaces
.implements Lm3/b;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/PapaMainV4Adapter;

.field public final synthetic c:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/PapaMainV4Adapter;Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/i4;->b:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iput-object p2, p0, Lcom/join/mgps/adapter/i4;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final OnBannerClick(I)V
    .locals 2

    iget-object v0, p0, Lcom/join/mgps/adapter/i4;->b:Lcom/join/mgps/adapter/PapaMainV4Adapter;

    iget-object v1, p0, Lcom/join/mgps/adapter/i4;->c:Ljava/util/List;

    invoke-static {v0, v1, p1}, Lcom/join/mgps/adapter/PapaMainV4Adapter;->p(Lcom/join/mgps/adapter/PapaMainV4Adapter;Ljava/util/List;I)V

    return-void
.end method
