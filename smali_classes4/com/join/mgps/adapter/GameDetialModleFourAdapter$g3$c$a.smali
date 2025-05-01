.class Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c$a;
.super Ljava/lang/Object;
.source "GameDetialModleFourAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;->a(Lcom/join/mgps/base/BaseViewHolder;Lcom/join/mgps/dto/CollectionBeanSub;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/CollectionBeanSub;

.field final synthetic c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;Lcom/join/mgps/dto/CollectionBeanSub;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c$a;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;

    iput-object p2, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c$a;->b:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c$a;->b:Lcom/join/mgps/dto/CollectionBeanSub;

    invoke-virtual {p1}, Lcom/join/mgps/dto/CollectionBeanSub;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lcom/join/mgps/Util/IntentDateBean;->getExtBean()Lcom/join/mgps/dto/ExtBean;

    move-result-object v0

    const-string v1, "13301"

    .line 3
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->setFrom(Ljava/lang/String;)V

    const/16 v1, 0x33f5

    .line 4
    invoke-virtual {v0, v1}, Lcom/join/mgps/dto/ExtBean;->set_from_type(I)Lcom/join/mgps/dto/ExtBean;

    .line 5
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c$a;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;

    iget-object v1, v1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3$c;->a:Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;

    iget-object v1, v1, Lcom/join/mgps/adapter/GameDetialModleFourAdapter$g3;->c:Lcom/join/mgps/adapter/GameDetialModleFourAdapter;

    invoke-static {v1}, Lcom/join/mgps/adapter/GameDetialModleFourAdapter;->g(Lcom/join/mgps/adapter/GameDetialModleFourAdapter;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    return-void
.end method
