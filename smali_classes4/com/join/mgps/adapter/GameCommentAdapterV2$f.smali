.class Lcom/join/mgps/adapter/GameCommentAdapterV2$f;
.super Ljava/lang/Object;
.source "GameCommentAdapterV2.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameCommentAdapterV2;->n(Landroid/view/View;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/InformationCommentBeanV2;

.field final synthetic c:Lcom/join/mgps/adapter/GameCommentAdapterV2;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameCommentAdapterV2;Lcom/join/mgps/dto/InformationCommentBeanV2;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$f;->c:Lcom/join/mgps/adapter/GameCommentAdapterV2;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$f;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$f;->c:Lcom/join/mgps/adapter/GameCommentAdapterV2;

    iget-object p1, p1, Lcom/join/mgps/adapter/GameCommentAdapterV2;->d:Lcom/join/mgps/adapter/GameCommentAdapterV2$j;

    if-eqz p1, :cond_0

    .line 2
    iget-object v0, p0, Lcom/join/mgps/adapter/GameCommentAdapterV2$f;->b:Lcom/join/mgps/dto/InformationCommentBeanV2;

    invoke-interface {p1, v0}, Lcom/join/mgps/adapter/GameCommentAdapterV2$j;->b(Lcom/join/mgps/dto/InformationCommentBeanV2;)V

    :cond_0
    return-void
.end method
