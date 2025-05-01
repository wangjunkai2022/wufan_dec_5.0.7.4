.class Lcom/join/mgps/customview/wheel/picker/b$b;
.super Ljava/lang/Object;
.source "TimePicker.java"

# interfaces
.implements Lcom/join/mgps/customview/wheel/picker/DateTimePicker$k;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/join/mgps/customview/wheel/picker/b;->H1(Lcom/join/mgps/customview/wheel/picker/b$c;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/join/mgps/customview/wheel/picker/b$c;

.field final synthetic b:Lcom/join/mgps/customview/wheel/picker/b;


# direct methods
.method constructor <init>(Lcom/join/mgps/customview/wheel/picker/b;Lcom/join/mgps/customview/wheel/picker/b$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/join/mgps/customview/wheel/picker/b$b;->b:Lcom/join/mgps/customview/wheel/picker/b;

    iput-object p2, p0, Lcom/join/mgps/customview/wheel/picker/b$b;->a:Lcom/join/mgps/customview/wheel/picker/b$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/join/mgps/customview/wheel/picker/b$b;->a:Lcom/join/mgps/customview/wheel/picker/b$c;

    invoke-interface {v0, p1, p2, p3}, Lcom/join/mgps/customview/wheel/picker/b$c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
