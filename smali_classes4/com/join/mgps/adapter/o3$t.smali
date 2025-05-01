.class Lcom/join/mgps/adapter/o3$t;
.super Ljava/lang/Object;
.source "PapaMainAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/adapter/o3;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lcom/join/mgps/dto/AppBeanMain;

.field final synthetic c:Lcom/join/mgps/business/RecomDatabeanBusiness;

.field final synthetic d:Lcom/join/mgps/adapter/o3;


# direct methods
.method constructor <init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/AppBeanMain;Lcom/join/mgps/business/RecomDatabeanBusiness;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/adapter/o3$t;->d:Lcom/join/mgps/adapter/o3;

    iput-object p2, p0, Lcom/join/mgps/adapter/o3$t;->b:Lcom/join/mgps/dto/AppBeanMain;

    iput-object p3, p0, Lcom/join/mgps/adapter/o3$t;->c:Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/join/mgps/Util/IntentUtil;->getInstance()Lcom/join/mgps/Util/IntentUtil;

    move-result-object p1

    iget-object v0, p0, Lcom/join/mgps/adapter/o3$t;->d:Lcom/join/mgps/adapter/o3;

    invoke-static {v0}, Lcom/join/mgps/adapter/o3;->o(Lcom/join/mgps/adapter/o3;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/join/mgps/adapter/o3$t;->b:Lcom/join/mgps/dto/AppBeanMain;

    invoke-virtual {v1}, Lcom/join/mgps/dto/AppBeanMain;->getIntentDataBean()Lcom/join/mgps/Util/IntentDateBean;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lcom/join/mgps/Util/IntentUtil;->intentActivity(Landroid/content/Context;Lcom/join/mgps/Util/IntentDateBean;)V

    .line 2
    iget-object p1, p0, Lcom/join/mgps/adapter/o3$t;->d:Lcom/join/mgps/adapter/o3;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/join/mgps/adapter/o3$t;->c:Lcom/join/mgps/business/RecomDatabeanBusiness;

    invoke-virtual {v1}, Lcom/join/mgps/business/RecomDatabeanBusiness;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/join/mgps/adapter/o3;->p(Lcom/join/mgps/adapter/o3;Ljava/lang/String;)V

    return-void
.end method
