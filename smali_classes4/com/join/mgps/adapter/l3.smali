.class public final synthetic Lcom/join/mgps/adapter/l3;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/adapter/o3;

.field public final synthetic c:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

.field public final synthetic d:Lcom/join/mgps/adapter/o3$p1;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/o3$p1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/adapter/l3;->b:Lcom/join/mgps/adapter/o3;

    iput-object p2, p0, Lcom/join/mgps/adapter/l3;->c:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    iput-object p3, p0, Lcom/join/mgps/adapter/l3;->d:Lcom/join/mgps/adapter/o3$p1;

    iput p4, p0, Lcom/join/mgps/adapter/l3;->e:I

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/join/mgps/adapter/l3;->b:Lcom/join/mgps/adapter/o3;

    iget-object v1, p0, Lcom/join/mgps/adapter/l3;->c:Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;

    iget-object v2, p0, Lcom/join/mgps/adapter/l3;->d:Lcom/join/mgps/adapter/o3$p1;

    iget v3, p0, Lcom/join/mgps/adapter/l3;->e:I

    invoke-static {v0, v1, v2, v3, p1}, Lcom/join/mgps/adapter/o3;->h(Lcom/join/mgps/adapter/o3;Lcom/join/mgps/dto/PAPAHomeBeanV7$HomeBeanDTO;Lcom/join/mgps/adapter/o3$p1;ILandroid/view/View;)V

    return-void
.end method
