.class public final synthetic Lcom/join/mgps/customview/s;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic b:Lcom/join/mgps/customview/u;


# direct methods
.method public synthetic constructor <init>(Lcom/join/mgps/customview/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/join/mgps/customview/s;->b:Lcom/join/mgps/customview/u;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/join/mgps/customview/s;->b:Lcom/join/mgps/customview/u;

    invoke-static {v0, p1}, Lcom/join/mgps/customview/u;->b(Lcom/join/mgps/customview/u;Landroid/view/View;)V

    return-void
.end method
